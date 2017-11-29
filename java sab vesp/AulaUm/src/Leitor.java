import java.util.Scanner;

public class Leitor {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero: ");
		numero = leitor.nextInt();
		
		System.out.println("Você digitou: " + numero);

	}

}
