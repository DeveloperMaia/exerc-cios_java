import java.util.Scanner;

public class CONTAS {

	public static void main(String[] args) {
		
		int num1;
		int num2;
		
		
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println(" Ol�, seja bem vindo, digite dois n�meros para descobrir como eles se d�o em diferentes opera��es.");
		
		System.out.println("Digite o primeiro n�mero:");
		
		num1 = leitor.nextInt();
	
		System.out.println("Agora digite o segundo n�mero:");
		
		num2 = leitor.nextInt();
		
		int soma = num1+num2;
		int subtra��o = num1-num2;
		int divis�o = num1/num2;
		int multiplica��o = num1*num2;
		int restodadivis�o = num1%num2;
		
		System.out.println("Aqui est�o os resultados:");
		System.out.println("Soma:"+soma);
		System.out.println("Subtra��o:"+subtra��o);
		System.out.println("Divis�o:"+divis�o);
		System.out.println("Multiplica��o:"+multiplica��o);
		System.out.println("Resto da Divis�o:"+restodadivis�o);
		
		
		

	}

}
