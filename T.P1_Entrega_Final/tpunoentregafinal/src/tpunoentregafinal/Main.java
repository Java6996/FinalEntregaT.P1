package tpunoentregafinal;

import javax.swing.*;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Opciones = {
				"Jugar partida","Salir"
				};
		int opcion =0;
		do {
			opcion = JOptionPane.showOptionDialog(null, "¿Usted quiere jugar una partida?", "Left 4 Dead 2", 0, JOptionPane.DEFAULT_OPTION,new ImageIcon(Main.class.getResource("/imga/versus.jpg")), null, Opciones);
			switch (opcion) {
			case 0://Jugar partida
						int opcion1 =0;
						String[] Opciones1 = {
								"Zombies","Supervivientes","Ver equipos","Empezar la campaña","Salir"
								};
						do {
							GestorEquipos gestor = new GestorEquipos();
							//
					        //
							opcion1= JOptionPane.showOptionDialog(null, "Elegí un equipo", "Left 4 Dead 2", 
									opcion1, opcion1, null, Opciones1, Opciones1[0]);
							switch (opcion1) {
							case 0: //Zombies
			                    gestor.getZombies().agregarJugador(null);
			                    gestor.getZombies().JugadoresZombies();
							break;
							case 1://Supervivientes
								gestor.getSupervivientes().agregarJugador(null);
								gestor.getSupervivientes().JugadoresSupers();
							break;
							case 2://Ver equipos
								String[] OpcionesEquipo = {"Zombies", "Supervivientes", "Salir"};
						        int opcionEquipo = 0;
						        do {
						        	opcionEquipo = JOptionPane.showOptionDialog(null, "Elegí un equipo", null, opcionEquipo, opcionEquipo, null, OpcionesEquipo, OpcionesEquipo);
						        	switch (opcionEquipo) {
									case 0:
										gestor.getZombies().JugadoresZombies();
										break;
									case 1:
										gestor.getSupervivientes().JugadoresSupers();
										break;
									case 2:
										JOptionPane.showMessageDialog(null, "Saliendo de la sección de 'Ver equipos'.");
										break;
									}
						        } while (opcion!=2);
							break;
							case 3://Empezar la campaña
								EmpezarCampaña(gestor);
							case 4://Salir de la partida
								JOptionPane.showMessageDialog(null, "Saliendo de la partida.");
								break;
							} 
						}while (opcion1!=4);
				case 1://Salir del menu principal
					JOptionPane.showMessageDialog(null, "Saliendo del menu principal.");
				break;
				}
		} while (opcion!=1);
	}
	public static void EmpezarCampaña(GestorEquipos gestor) {
        int capitulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de capítulos."));
        if (capitulos<=5&&capitulos==5) {
        	int puntosSupervivientes = 0;
            int puntosZombies = 0;
            for (int i = 0; i<=capitulos+1; i++) {
                Capitulos capitulo = new Capitulos(i, gestor, puntosSupervivientes, puntosZombies);
                capitulo.JugarCampaña();
                puntosSupervivientes += capitulo.getPuntosSupervivientes();
                puntosZombies += capitulo.getPuntosZombies();
            }
            JOptionPane.showMessageDialog(null, "Puntos finales:\nSupervivientes: " + puntosSupervivientes + "\nZombies: " + puntosZombies);
        } else {
        	JOptionPane.showMessageDialog(null, "Error: no se puede jugar la campaña, tiene más de 5 capítulos");
        }
      }
}