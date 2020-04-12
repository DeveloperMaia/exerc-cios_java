import java.util.Scanner;

public class CONTAS {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Olá, seja bem vindo, digite dois números para descobrir como eles se dão em diferentes operações.");
		
		System.out.println("Digite o primeiro número:");
		
		num1 = leitor.nextInt();
	
		System.out.println("Agora digite o segundo número:");
		
		num2 = leitor.nextInt();
		
		int soma = num1+num2;
		int subtração = num1-num2;
		int divisão = num1/num2;
		int multiplicação = num1*num2;
		int restodadivisão = num1%num2;
		
		System.out.println("Aqui estão os resultados:");
		System.out.println("Soma:"+soma);
		System.out.println("Subtração:"+subtração);
		System.out.println("Divisão:"+divisão);
		System.out.println("Multiplicação:"+multiplicação);
		System.out.println("Resto da Divisão:"+restodadivisão);
		
		
		

	}

}
