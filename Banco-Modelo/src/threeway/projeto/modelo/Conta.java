package threeway.projeto.modelo;

import java.util.ArrayList;
import java.util.Date;

import threeway.projeto.modelo.util.UtilData;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private Date dataAbertura;
	private ArrayList movimento;
	
	public Conta() {
		dataAbertura = UtilData.data();
		movimento = new ArrayList<>();
	}
	
	public Conta(String nome, int numConta ) {
		this();
		this.titular = nome;
		this.numero = numConta;
		saldo = 0.0;
	}
	

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Date getDataAbertura() {
		return dataAbertura;
	}

	public void setDataAbertura(Date dataAbertura) {
		this.dataAbertura = dataAbertura;
	}

}
