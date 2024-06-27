package tpunoentregafinal;

import java.util.LinkedList;
import javax.swing.JOptionPane;

public class Equipo {
	private String username;
    private LinkedList<Jugadores> jugadores;
    public Equipo(String username, LinkedList<Jugadores> jugadores) {
		super();
		this.username = username;
		this.jugadores = jugadores;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LinkedList<Jugadores> getJugadores() {
		return jugadores;
	}

	public void setJugadores(LinkedList<Jugadores> jugadores) {
		this.jugadores = jugadores;
	}
	@Override
	public String toString() {
		return "Equipo [username=" + username + ", jugadores=" + jugadores + "\n]";
	}
	public void agregarJugador(Jugadores jugador) {
        if (jugadores.size() <=4) {
            jugadores.add(jugador);
            JOptionPane.showMessageDialog(null, "Jugador " + username + " agregado al equipo.");
        } else {
            JOptionPane.showMessageDialog(null, "El equipo " + username + " ya tiene 4 jugadores, no se pueden agregar más jugadores.");
        }
    }
    public void JugadoresSupers() {
        int cant=4;
        for (int i = 0; i<=cant; i++) {
            Jugadores jugador = new Jugadores(true, false);
            agregarJugador(jugador);
        }
    }
    public void JugadoresZombies() {
        int cant=4;
        for (int i = 0; i<=cant; i++) {
            Jugadores jugador = new Jugadores(true, false);
            agregarJugador(jugador);
        }
    }
    public int PuntosSupervivientes() {
        int puntos = 0;
        boolean Vivos = true;
        for (Jugadores jugador : jugadores) {
            if (jugador.isVivo()) {
                Vivos = true;
            }else if(jugador.isEliminado()) {
            	Vivos = false;
            }
        }
        if (Vivos) {
            puntos=500+100;
        } else {
            puntos=500;
        }
        return puntos;
    }
    public int PuntosZombies() {
        int daño = (int)(Math.random()*600);
        int puntos = daño;
        if (daño>=500) {
            puntos+=25;
        }
        return puntos;
    }
}