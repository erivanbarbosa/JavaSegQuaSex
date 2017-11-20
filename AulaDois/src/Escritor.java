import java.util.Scanner;

public class Escritor {
	public static void main(String[] args ) {
		String texto;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite um texto qualquer: ");
		texto = leitor.nextLine();
		
		System.out.println("Você digitou: " + texto);
	}
}
