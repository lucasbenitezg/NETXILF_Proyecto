package logica;

public class Paga {
	
	private int numTarjeta;
	private String nomTarjeta;
	private int codigoTarj;
	
	public Paga(int numTarjeta, String nomTarjeta, int codigoTarj) {
		this.numTarjeta = numTarjeta;
		this.nomTarjeta = nomTarjeta;
		this.codigoTarj = codigoTarj;
	}

	public int getNumTarjeta() {
		return numTarjeta;
	}

	public void setNumTarjeta(int numTarjeta) {
		this.numTarjeta = numTarjeta;
	}

	public String getNomTarjeta() {
		return nomTarjeta;
	}

	public void setNomTarjeta(String nomTarjeta) {
		this.nomTarjeta = nomTarjeta;
	}

	public int getCodigoTarj() {
		return codigoTarj;
	}

	public void setCodigoTarj(int codigoTarj) {
		this.codigoTarj = codigoTarj;
	}
	
	@Override
	public String toString() {
		return "";
	}

}
