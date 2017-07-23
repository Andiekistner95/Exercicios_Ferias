package exercicio_11;

public class Cidade {

	private int codigo;
	private String nome;
	private int uf;
	private int id = 0;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getUf() {
		return uf;
	}
	public void setUf(int uf) {
		this.uf = uf;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	private void geraId(){
		id++;
		setCodigo(id);
	
	}
	
	public Cidade(String nome,int uf) {
	setNome(nome);
	this.uf = uf;
	geraId();
	}
	
}
