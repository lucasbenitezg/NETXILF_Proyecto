package logica;

public class Pelicula extends Programacion{

	public Pelicula(int idProg, Fecha fecha, String nombre, 
			String genero, String descripcion, String caratula) {
		
		super(idProg, fecha, nombre, genero, descripcion, caratula);
		
	}
	
	@Override
	public String toString () {
		return "";
	}
}
