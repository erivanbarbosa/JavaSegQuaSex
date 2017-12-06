package threeway.projeto.service;

import threeway.projeto.modelo.Conta;
import threeway.projeto.modelo.Transacao;
import threeway.projeto.modelo.enums.EnumTipoTransacao;
import threeway.projeto.modelo.util.UtilData;

public class ContaService {

	// Adiciona o valor informado na conta informada
	public void depositar(Conta contaDestino, double valor) {
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		
		registrarHistoricoTransacao(null, contaDestino, valor, 
				"Deposito na conta", EnumTipoTransacao.DEPOSITO);
	}

	// Debita o valor informado na conta informada
	public void sacar(Conta contaSaque, double valor) {
		contaSaque.setSaldo(contaSaque.getSaldo() - valor);
		
		registrarHistoricoTransacao(contaSaque, null, valor,
				"Saque da conta", EnumTipoTransacao.SAQUE);
	}

	// Debita o valor informado na conta de origem
	// e adiciona o valor informado na conta de destino
	public void transferir(Conta contaSaque, double valor, Conta contaDestino) {
		this.transferir(contaSaque, valor, contaDestino, 0.0);
		
		registrarHistoricoTransacao(contaSaque, contaDestino, valor,
				"Transferencia entre contas", EnumTipoTransacao.TRANSFERENCIA);
	}

	public void transferir(Conta contaSaque, double valor, Conta contaDestino,
			double limite) {

		if (contaSaque.getSaldo() + limite < valor) {
			System.out.println("Saldo insuficiente!");
		} else {
			this.sacar(contaSaque, valor);
			this.depositar(contaDestino, valor);
		}

	}

	void registrarHistoricoTransacao(Conta contaDebito, Conta contaCredito,
			double valor, String descricao, EnumTipoTransacao tipoTransacao) {

		Transacao transacao = new Transacao(UtilData.data(), contaDebito,
				contaCredito, valor, descricao, tipoTransacao);

		if(contaDebito != null ) {
			contaDebito.getMovimento().add(transacao);
		}
		if(contaCredito != null ) {
			contaCredito.getMovimento().add(transacao);
		}
	}
}
