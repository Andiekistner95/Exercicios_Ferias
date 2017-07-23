package exercicio_11;

public class UF {

	private int codigo;
	private String nome;
	private int id = 0;

	public UF(String nome) {
		this.nome = nome;
		geraId();
	}

	private void geraId() {
		id++;
		setCodigo(id);
	}

	public int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
