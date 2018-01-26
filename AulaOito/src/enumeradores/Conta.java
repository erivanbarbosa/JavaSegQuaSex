package enumeradores;

public class Conta {
	private int numero;
	private String titular;
	private double saldo;
	private EnumTipoConta tipo;
	
	
	
	public Conta(int numero, String titular, double saldo, EnumTipoConta tipo) {
		
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.tipo = tipo;
		
		System.out.println("Criando conta numero: " + numero);
		System.out.println("titular: " + titular + " tipo: " + tipo );
		System.out.println();
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
	public EnumTipoConta getTipo() {
		return tipo;
	}
	public void setTipo(EnumTipoConta tipo) {
		this.tipo = tipo;
	}
	
	
}
