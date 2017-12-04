import java.util.Scanner;

import dominio.Conta;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String numeroConta = null;
		String senhaConta = null;
		int opcao;
		Conta conta = null;

		
		Conta[] contas = new Conta[1000];
		
		for(int i = 0; i < contas.length; i++ ) {
			int saldo = ((i + 2) * -100 );
			String numero = "0000" + i;
			String senha = i + "000";
			
			
			contas[i] = new Conta(saldo, numero, senha);
		}
		
		

		
		System.out.println("Bem vindo ao caixa eletronico!");
		
		System.out.println("Informe o numero da sua conta: ");
		numeroConta = input.nextLine();
		System.out.println("Informe a senha: ");
		senhaConta = input.nextLine();
		
		for(int i = 0; i < contas.length; i++ ) {
			if( contas[i].getNumero().equals(numeroConta) ) {
				if(contas[i].getSenha().equals(senhaConta) ) {
					conta = contas[i];
				}
			}
		}
		
		if(conta != null ) {
		
		do {
		
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("Escolha a operação desejada: ");
		System.out.println("1 - Consultar Saldo");
		System.out.println("2 - Efetuar Depósito");
		System.out.println("3 - Efetuar Saque");
		System.out.println("0 - Sair");

		opcao = input.nextInt();
		System.out.println();
		
		
		switch (opcao) {
		case 1:
			System.out.println("O seu saldo é igual a: " + conta.verSaldo());
			break;
		case 2:
			System.out.println("Digite o valor do Depósito: ");
			double valorDeposito = input.nextDouble();
			conta.depositar(valorDeposito);

			System.out.println("Valor do deposito: " + valorDeposito);
			break;
		case 3:
			System.out.println("Digite o valor do saque: ");
			double valorSaque = input.nextDouble();
			int resultado = conta.sacar(valorSaque);
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
			System.out.println("A opção escolhida é inválida!");
		}
		
		} while(opcao != 0 );

		}
		else {
			System.out.println("A conta ou a senha informado está incorreta!");
		}
	}
}
