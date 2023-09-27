package logica;

public class Cliente {
	
	private int cedula;
	private String nombre;
	private String apellido;
	private telefonos telefonos;
	private String ciudad;
	private String pais;
	private String email;
	private String contrasenia;
	
	//AGREGACION
	private Paga tarjeta;
	
	public Cliente() {
		
	}
	
	public Cliente(int cedula, String nombre, String apellido,telefonos telefonos, String ciudad, 
			String pais, String email,String contrasenia, Paga tarjeta) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefonos = telefonos;
		this.ciudad = ciudad;
		this.pais = pais;
		this.email = email;
		this.contrasenia = contrasenia;
		this.tarjeta = tarjeta;
	}

	public int getCedula() {
		return cedula;
	}

	public Paga getTarjeta() {
		return tarjeta;
	}

	public void setTarjeta(Paga tarjeta) {
		this.tarjeta = tarjeta;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public telefonos getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(telefonos telefonos) {
		this.telefonos = telefonos;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	@Override
	public String toString () {
		return"";
	}
	
	
}
