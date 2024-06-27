package tpunoentregafinal;

public class Jugadores {
	private boolean vivo;
	private boolean eliminado;
	public Jugadores(boolean vivo, boolean eliminado) {
		super();
		this.vivo = vivo;
		this.eliminado = eliminado;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	@Override
	public String toString() {
		return "Jugadores [vivo=" + vivo + ", eliminado=" + eliminado + "\n]";
	}
}
