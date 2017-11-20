
public class Conta {
	private double saldo;
	
	
	public Conta(double valorInicial) {
		saldo = valorInicial;
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
	
} //fim da classe conta
