package logica;

public class Calificacion {

	private int puntuacion;
	private double tiempoVisto;
	
	public Calificacion(int puntuacion, double tiempoVisto) {
		this.puntuacion = puntuacion;
		this.tiempoVisto = tiempoVisto;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public double getTiempoVisto() {
		return tiempoVisto;
	}

	public void setTiempoVisto(double tiempoVisto) {
		this.tiempoVisto = tiempoVisto;
	}

	@Override
	public String toString() {
		return "";
	}
	
	
}
