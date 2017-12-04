package threeway.projeto.service;

import threeway.projeto.modelo.Conta;

public class ContaService {
	
	// Adiciona o valor informado na conta informada
	public void depositar(Conta contaDestino, double valor ) {
		contaDestino.setSaldo(contaDestino.getSaldo() + valor );
	}
	
	// Debita o valor informado na conta informada
	public void sacar(Conta contaSaque, double valor ) {
		contaSaque.setSaldo(contaSaque.getSaldo() - valor);
	}
	
	// Debita o valor informado na conta de origem
	// e adiciona o valor informado na conta de destino
	public void transferir(Conta contaSaque, double valor, Conta contaDestino ) {
		this.transferir(contaSaque, valor, contaDestino, 0.0);
	}
	
	public void transferir(Conta contaSaque, double valor, Conta contaDestino, double limite ) {
		
		if(contaSaque.getSaldo() + limite < valor ) {
			System.out.println("Saldo insuficiente!");
		}
		else {
			this.sacar(contaSaque, valor);
			this.depositar(contaDestino, valor);
		}	
	}
}
