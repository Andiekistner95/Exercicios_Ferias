package exercicio_9;

public class teste {
	public static void main(String[] args) {

		Pais pais1 = new Pais("Brasil", "Brasilia", 12345);
		pais1.getPaisesFronteira().add("Chile");
		pais1.getPaisesFronteira().add("Bolivia");
		
		System.out.println(pais1.getPaisesFronteira().toString());
		
		Pais pais2 = new Pais("Brasil", "Brasilia", 2345);
		Pais pais3 = new Pais("Argentina", "Buenos Aires", 745);

		if (pais1.verificaPaisIgual(pais2) == true) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}

		if (pais1.verificaPaisIgual(pais3) == true) {
			System.out.println("São iguais");
		} else {
			System.out.println("São diferentes");
		}
	}
}
