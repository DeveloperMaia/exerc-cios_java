import java.util.Scanner;

public class algoritmo {

	public static void main(String[] args) {
		//olá mundo
		
		String nome, cidade;
		int idade;
		
		Scanner leitor = new Scanner(System.in);
		

		
		System.out.println("Olá, bem vindo!");
		System.out.println("Qual é o seu nome?");
		nome = leitor.nextLine();
	    System.out.println(" Olá "+nome+" de onde você vem?");
	    cidade = leitor.nextLine();
	    System.out.println("E quantos anos você tem?");
	    idade = leitor.nextInt();
	    System.out.println("Então você é "+nome+", tem "+idade+" anos e vem de "+cidade+", é um prazer lhe conhecer!");
	    

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
