package exercicio_8;

public enum menu {

	SALVAR(1),IMPRIMIR(2),ABRIR(3),VISUALIZAR(4),FECHAR(5);
	
	private int valor;
	menu(int valorOpcao){
		this.valor = valorOpcao;
		
	}
	public int getValor(){
		return valor;
	}
}
