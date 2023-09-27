package logica;

public class Serie extends Programacion{

	private int temporada;
	private int capitulos;
	
	public Serie(int idProg, Fecha fecha, String nombre, String genero, 
			String descripcion, String caratula,int temporada,int capitulos) {
		
		super(idProg, fecha, nombre, genero, descripcion, caratula);
		
		this.capitulos = capitulos;
		this.temporada = temporada;
	}

	public int getTemporada() {
		return temporada;
	}

	public void setTemporada(int temporada) {
		this.temporada = temporada;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(int capitulos) {
		this.capitulos = capitulos;
	}
	
	@Override
	public String toString() {
		return "";
	}

}
