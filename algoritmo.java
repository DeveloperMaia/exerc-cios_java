import java.util.Scanner;

public class algoritmo {

	public static void main(String[] args) {
		//ol� mundo
		
		String nome, cidade;
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		

		
		System.out.println("Ol�, bem vindo!");
		System.out.println("Qual � o seu nome?");
		nome = leitor.nextLine();
	    System.out.println(" Ol� "+nome+" de onde voc� vem?");
	    cidade = leitor.nextLine();
	    System.out.println("E quantos anos voc� tem?");
	    idade = leitor.nextInt();
	    System.out.println("Ent�o voc� � "+nome+", tem "+idade+" anos e vem de "+cidade+", � um prazer lhe conhecer!");
	    

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
