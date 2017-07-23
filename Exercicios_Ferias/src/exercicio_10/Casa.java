package exercicio_10;

import java.util.ArrayList;

public class Casa {

	private String cor;
	private ArrayList<Porta> portas = new ArrayList<Porta>();

	public ArrayList<Porta> getPortas() {
		return portas;
	}

	public void setPortas(ArrayList<Porta> portas) {
		this.portas = portas;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void Pinta(String cor) {
		this.cor = cor;
	}

	public int qntPortas() {
		return portas.size();

	}

	public int qntPortasAbertas() {
		int totalAberta = 0;

		for (Porta porta : portas) {
			if (porta.estaAberta()) {
				totalAberta++;

			}
		}
		return totalAberta;

	}
}
