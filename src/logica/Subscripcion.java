package logica;

public class Subscripcion {
	
	private int idPlan;
	private int tipoPlan;
	private double precioPlan;
	
	public Subscripcion() {
		
	}

	public Subscripcion(int idPlan, int tipoPlan, double precioPlan) {
		super();
		this.idPlan = idPlan;
		this.tipoPlan = tipoPlan;
		this.precioPlan = precioPlan;
	}

	public int getIdPlan() {
		return idPlan;
	}

	public void setIdPlan(int idPlan) {
		this.idPlan = idPlan;
	}

	public int getTipoPlanl() {
		return tipoPlan;
	}

	public void setTipoPlanl(int tipoPlanl) {
		this.tipoPlan = tipoPlanl;
	}

	public double getPrecioPlan() {
		return precioPlan;
	}

	public void setPrecioPlan(double precioPlan) {
		this.precioPlan = precioPlan;
	}
	
	@Override
	public String toString () {
		return "";
	}

}
