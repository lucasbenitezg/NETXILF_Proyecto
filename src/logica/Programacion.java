package logica;

public class Programacion {
	
	private int idProg;
	private Fecha fecha;
	private String nombre;
	private String Genero;
	private String descripcion;
	private String caratula;
	
	public Programacion (int cedula, String nombre2, String apellido, String ciudad, String pais, String email, String contrasenia) {}

	public Programacion(int idProg, Fecha fecha, String nombre, String genero, 
			String descripcion, String caratula) {
		this.idProg = idProg;
		this.fecha = fecha;
		this.nombre = nombre;
		this.Genero = genero;
		this.descripcion = descripcion;
		this.caratula = caratula;
	}

	public int getIdProg() {
		return idProg;
	}

	public void setIdProg(int idProg) {
		this.idProg = idProg;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCaratula() {
		return caratula;
	}

	public void setCaratula(String caratula) {
		this.caratula = caratula;
	}
	
	
	@Override
	public String toString() {
		return "";
	}

}
