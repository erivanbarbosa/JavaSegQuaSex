import java.util.Scanner;

public class OperadoresLogicos {

	public static void main(String[] args ) {
		boolean valor1, valor2;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um valor booleano");
		valor1 = leitor.nextBoolean();
		System.out.println("Digite um valor booleano");
		valor2 = leitor.nextBoolean();
		
		System.out.println("A e B = " + (valor1 && valor2));
		System.out.println("A ou B = " + (valor1 || valor2));
		
		
		
	}
}
