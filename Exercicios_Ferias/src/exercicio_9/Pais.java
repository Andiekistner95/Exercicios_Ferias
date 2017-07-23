package exercicio_9;

import java.util.ArrayList;

public class Pais {

	private String nomePais;
	private String nomeCapital;
	private double dimensaoKm;
	private ArrayList<String> paisesFronteira = new ArrayList<String>();
	
	public Pais(String nomePais, String nomeCapital, double dimensaoKm) {
		this.nomePais = nomePais;
		this.nomeCapital = nomeCapital;
		this.dimensaoKm = dimensaoKm;
		
	}
	
	public String getNomePais() {
		return nomePais;
	}
	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}
	public String getNomeCapital() {
		return nomeCapital;
	}
	public void setNomeCapital(String nomeCapital) {
		this.nomeCapital = nomeCapital;
	}
	public double getDimensaoKm() {
		return dimensaoKm;
	}
	public void setDimensaoKm(double dimensaoKm) {
		this.dimensaoKm = dimensaoKm;
	}
	public ArrayList<String> getPaisesFronteira() {
		return paisesFronteira;
	}
	public void setPaisesFronteira(ArrayList<String> paisesFronteira) {
		this.paisesFronteira = paisesFronteira;
	}
	
	public boolean verificaPaisIgual(final Pais outroPais){
		boolean igual = false;
		if(this.nomeCapital.equals(outroPais.nomeCapital) && this.nomePais.equals(outroPais.nomePais)){
			igual = true;
		}
		return igual;
		}
	}

