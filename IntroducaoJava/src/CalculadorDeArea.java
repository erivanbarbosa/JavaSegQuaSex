import java.util.Scanner;

import javax.swing.JOptionPane;

public class CalculadorDeArea {
	public static void main(String[] args ) {
		double pi = 3.1415;
		double raio;
		double area;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor do raio: ");
		raio = input.nextDouble();
		
		area = pi * (raio * raio);
		
		System.out.println("O valor da area �: " + area);
		
		
	}
}
