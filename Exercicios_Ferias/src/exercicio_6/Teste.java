package exercicio_6;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Teste {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

		Professor pf1 = new Professor();
		pf1.setNome("Vinicius");
		pf1.setDtNascimento(sdf.parse("18/12/1989"));
		pf1.setMateria("java");
		pf1.setPeriodo('m');
		
		Aluno a1 = new Aluno();
		a1.setNome("Carlos");
		a1.setPeriodo('m');
		a1.setSerie(9);
		a1.setTurma(2);
		a1.setDtNascimento(sdf.parse("07/09/1993"));
		
		System.out.println("Nome: " + pf1.getNome() +"\nData de nascimento: "+ sdf.format(pf1.getDtNascimento()) +"\nMateria: "+ pf1.getMateria() +"\nPeriodo: "+ pf1.getPeriodo() );
		
		System.out.println("Nome: " + a1.getNome() +"\nData de nascimento: "+ sdf.format(a1.getDtNascimento()) +"\nSerie: "+ a1.getSerie() +"\nPeriodo: "+ a1.getPeriodo() );
		
	}
}
