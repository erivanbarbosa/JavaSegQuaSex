import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int opcao;

		System.out.println("Bem vindo ao caixa eletronico!");

		System.out.println("Digite o valor inicial da conta: ");
		double valorInicial = input.nextDouble();
		Conta conta1 = new Conta(valorInicial);

		do {
		
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("Escolha a opera��o desejada: ");
		System.out.println("1 - Consultar Saldo");
		System.out.println("2 - Efetuar Dep�sito");
		System.out.println("3 - Efetuar Saque");
		System.out.println("0 - Sair");

		opcao = input.nextInt();
		System.out.println();
		
		
		switch (opcao) {
		case 1:
			System.out.println("O seu saldo � igual a: " + conta1.verSaldo());
			break;
		case 2:
			System.out.println("Digite o valor do Dep�sito: ");
			double valorDeposito = input.nextDouble();
			conta1.depositar(valorDeposito);

			System.out.println("Valor do deposito: " + valorDeposito);
			break;
		case 3:
			System.out.println("Digite o valor do saque: ");
			double valorSaque = input.nextDouble();
			int resultado = conta1.sacar(valorSaque);
			if (resultado == 0) {
				System.out.println("O saque foi realizado com sucesso!");
			} else {
				System.out.println("Saldo insuficiente");
			}

			System.out.println("Valor do saque: " + valorSaque);
			break;
		case 0:
			System.out.println("Saindo do programa!");
			break;
		
		default:
			System.out.println("A op��o escolhida � inv�lida!");
		}
		
		} while(opcao != 0 );

	}
}
