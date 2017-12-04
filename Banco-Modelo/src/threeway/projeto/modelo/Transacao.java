package threeway.projeto.modelo;

import java.util.Date;

import threeway.projeto.modelo.enums.EnumTipoTransacao;
import threeway.projeto.modelo.util.UtilData;

public class Transacao {
	private Date data;
	private Conta contaDebito;
	private Conta contaCredito;
	private double valor;
	private String descricao;
	private EnumTipoTransacao tipoTransacao;

	public Transacao(Date data, Conta contaDebito, Conta contaCredito,
			double valor, String descricao, EnumTipoTransacao tipoTransacao) {
		this.data = data;
		this.contaDebito = contaDebito;
		this.contaCredito = contaCredito;
		this.valor = valor;
		this.descricao = descricao;
		this.tipoTransacao = tipoTransacao;
	}

	public String toString() {
		String texto = "";

		if (EnumTipoTransacao.TRANSFERENCIA == tipoTransacao) {
			texto = "Transacao data " + UtilData.DDMMAAAAHHMM(data)
					+ ", conta debito " + contaDebito.getNumero()
					+ ", conta credito " + contaCredito.getNumero() + ", valor "
					+ valor + ", descricao -> " + descricao;
		} else if (EnumTipoTransacao.DEPOSITO == tipoTransacao) {
			texto = "Deposito data " + UtilData.DDMMAAAAHHMM(getData())
					+ ", conta " + getContaCredito().getNumero() + ", valor "
					+ getValor() + ", descricao -> " + getDescricao();
		} else if (EnumTipoTransacao.SAQUE == tipoTransacao) {
			texto = "Saque data " + UtilData.DDMMAAAAHHMM(getData())
					+ ", conta " + getContaCredito().getNumero() + ", valor "
					+ getValor() + ", descricao -> " + getDescricao();

		}

		return texto;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Conta getContaDebito() {
		return contaDebito;
	}

	public void setContaDebito(Conta contaDebito) {
		this.contaDebito = contaDebito;
	}

	public Conta getContaCredito() {
		return contaCredito;
	}

	public void setContaCredito(Conta contaCredito) {
		this.contaCredito = contaCredito;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public EnumTipoTransacao getTipoTransacao() {
		return tipoTransacao;
	}

	public void setTipoTransacao(EnumTipoTransacao tipoTransacao) {
		this.tipoTransacao = tipoTransacao;
	}

}
