import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args ) {
		int numero1;
		int numero2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro numero: ");
		numero1 = input.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		numero2 = input.nextInt();

		
		System.out.printf("A soma do numero 1 com o numero 2 � ");
		System.out.println(numero1 + numero2);
		System.out.println("A subtra��o do numero 1 pelo numero 2 � " + (numero1 - numero2) );
		System.out.println(numero1 - numero2);
		System.out.printf("A multiplica��o de numero 1 pelo numero 2 � ", numero1 * numero2);
		System.out.println(numero1 * numero2);
		System.out.printf("A divis�o do numero 1 pelo numero 2 � ", numero1 / numero2);
		System.out.println(numero1 / numero2);
		
	}
}
