package tpunoentregafinal;

import javax.swing.JOptionPane;

public class Capitulos {
	private int numeroCap; //numeroCap del capitulo
    private GestorEquipos gestor; //controlar la cantidad de jugadores de los dos equipos
    private int puntosSupervivientes;
    private int puntosZombies;
    public Capitulos(int numeroCap, GestorEquipos gestor, int puntosSupervivientes, int puntosZombies) {
		super();
		this.numeroCap = numeroCap;
		this.gestor = gestor;
		this.puntosSupervivientes = puntosSupervivientes;
		this.puntosZombies = puntosZombies;
	}
    public int getnumeroCap() {
		return numeroCap;
	}
	public void setnumeroCap(int numeroCap) {
		this.numeroCap = numeroCap;
	}
	public GestorEquipos getGestor() {
		return gestor;
	}
	public void setGestor(GestorEquipos gestor) {
		this.gestor = gestor;
	}
	public void setPuntosSupervivientes(int puntosSupervivientes) {
		this.puntosSupervivientes = puntosSupervivientes;
	}
	public int getPuntosSupervivientes() {
        return puntosSupervivientes;
    }
	public void setPuntosZombies(int puntosZombies) {
		this.puntosZombies = puntosZombies;
	}
    public int getPuntosZombies() {
        return puntosZombies;
    }
	@Override
	public String toString() {
		return "Capitulos [numeroCap=" + numeroCap + ", puntosSupervivientes=" + puntosSupervivientes + ", puntosZombies="
				+ puntosZombies + "\n]";
	}
	public void JugarCampaña() {
        puntosSupervivientes = gestor.getSupervivientes().PuntosSupervivientes();
        puntosZombies = gestor.getZombies().PuntosZombies();
        JOptionPane.showMessageDialog(null, "Capítulo numero: " + numeroCap + 
        		"\nPuntos del equipo de Supervivientes en el capítulo " + numeroCap + ": " +puntosSupervivientes+
        		"\nPuntos del equipo de Zombies en el capítulo " + numeroCap + ": " + puntosZombies);
    }
}
