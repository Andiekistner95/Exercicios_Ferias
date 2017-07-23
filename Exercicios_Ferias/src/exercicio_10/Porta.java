package exercicio_10;

public class Porta {

	private boolean aberta = false;
	private String cor;
	private double dimensaoX;
	private double dimensaoY;
	private double dimensaoZ;
	
	public Porta(boolean aberta,String cor, double dimensaoX, double dimensaoY, double dimensaoZ) {
		this.aberta = aberta;
		this.cor = cor;
		this.dimensaoX = dimensaoX;
		this.dimensaoY = dimensaoY;
		this.dimensaoZ = dimensaoZ;
	}

	public boolean isAberta() {
		return aberta;
	}

	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getDimensaoX() {
		return dimensaoX;
	}

	public void setDimensaoX(double dimensaoX) {
		this.dimensaoX = dimensaoX;
	}

	public double getDimensaoY() {
		return dimensaoY;
	}

	public void setDimensaoY(double dimensaoY) {
		this.dimensaoY = dimensaoY;
	}

	public double getDimensaoZ() {
		return dimensaoZ;
	}

	public void setDimensaoZ(double dimensaoZ) {
		this.dimensaoZ = dimensaoZ;
	}

	public void abre() {
		if (estaAberta() == false) {
			setAberta(true);
		}
	}

	public void fecha() {
		if (estaAberta()) {
			setAberta(false);
		}
	}

	public void pinta(String cor) {
		this.cor = cor;
	}

	public boolean estaAberta() {
		if (aberta) {
			return true;

		} else {
			return false;

		}
	}
}
