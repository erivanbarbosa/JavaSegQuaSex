import java.util.Scanner;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int numero1, numero2;
		Scanner leitor = new Scanner(System.in);
		int soma, subtracao, multiplicacao;
		double divisao;
		
		System.out.println("digite o numero 1");
		numero1 = leitor.nextInt();
		System.out.println("digite o numero 2");
		numero2 = leitor.nextInt();
		
		
		soma = numero1 + numero2;
		System.out.println("O resultado da soma é: " + soma);
		
		
		
	}

}
