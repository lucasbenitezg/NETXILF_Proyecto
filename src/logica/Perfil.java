package logica;

public class Perfil extends Subscripcion {

	private int idPerfil;
	private String nomPerfil;
	//Agregacion
	private Calificacion calificacionProg;
	
	public Perfil () {
		super();
	}
	
	public Perfil(int idPlan,int tipoPlan,double precioPlan ,
			int idPerfil, String nomPerfil, Calificacion calificacionProg) {
		
		super(idPlan,tipoPlan,precioPlan);
		
		this.idPerfil = idPerfil;
		this.nomPerfil = nomPerfil;
		this.calificacionProg = calificacionProg;
	}
	
	
	public Calificacion getCalificacionProg() {
		return calificacionProg;
	}

	public void setCalificacionProg(Calificacion calificacionProg) {
		this.calificacionProg = calificacionProg;
	}

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNomPerfil() {
		return nomPerfil;
	}

	public void setNomPerfil(String nomPerfil) {
		this.nomPerfil = nomPerfil;
	}
	
	@Override
	public String toString () {
		return"";
	}
	
	
	
}
