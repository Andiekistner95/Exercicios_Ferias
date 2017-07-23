package exercicio_10;

public class teste_porta {
	public static void main(String[] args) {

		Porta porta1 = new Porta(false, "azul", 1800d, 1200d, 30d);

		porta1.abre();
		porta1.fecha();
		porta1.setCor("Verde");
		porta1.setDimensaoX(1900d);
		porta1.setDimensaoY(1100d);
		porta1.setDimensaoZ(40d);
		porta1.estaAberta();

	}
}
