import java.util.Scanner;

public class JogadorDeDados {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de lado do dado: ");
		int quantidade = input.nextInt();
		Dado dado = new Dado(quantidade);
		
		for(int i = 0; i<50; i++ ) {
		System.out.println("Resultado igual: " + dado.rolar());
		}
	}

}
