package tpunoentregafinal;

public class GestorEquipos {
	private Equipo supervivientes;
    private Equipo zombies;
    public GestorEquipos() {
    	super();
		this.supervivientes = supervivientes;
		this.zombies = zombies;
	}
	public Equipo getSupervivientes() {
		return supervivientes;
	}

	public void setSupervivientes(Equipo supervivientes) {
		this.supervivientes = supervivientes;
	}

	public Equipo getZombies() {
		return zombies;
	}

	public void setZombies(Equipo zombies) {
		this.zombies = zombies;
	}

	@Override
	public String toString() {
		return "GestorEquipos [supervivientes=" + supervivientes + ", zombies=" + zombies + "\n]";
	}
}
