package exercicio_10;

public class teste_casa {
	public static void main(String[] args) {

		Casa casa1 = new Casa();
		casa1.setCor("Rosa");
		casa1.getPortas().add(new Porta(true, "Verde", 1677, 1424, 24));
		casa1.getPortas().add(new Porta(false, "Vermelho", 1600, 1424, 26));
		casa1.getPortas().add(new Porta(true, "Azul", 1700, 1424, 25));

		casa1.Pinta("Azul");
		casa1.qntPortasAbertas();
		casa1.qntPortas();
	}
}
