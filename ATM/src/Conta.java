
public class Conta {
	private double saldo;
	private String numero;
	private String senha;
	
	
	public Conta(double valorInicial, String numero, String senha) {
		
		saldo = (valorInicial >= 0) ? valorInicial : 0.0;
		this.numero = numero;
		this.senha = senha;
	}
	
	public double verSaldo() {
		return getSaldo();
	}
	
	public int sacar(double valor) {
		int resultadoOperacao = 1;
		
		if(!(valor > saldo) ) {
			saldo = saldo - valor;
			resultadoOperacao = 0;
		}
		
		return resultadoOperacao;
	}
	
	public void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double valor) {
		saldo = valor;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
} //fim da classe conta
