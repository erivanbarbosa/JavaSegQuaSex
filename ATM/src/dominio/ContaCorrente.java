package dominio;

public class ContaCorrente extends Conta{

	private double credito;
	
	public ContaCorrente(double valorInicial, String numero, String senha, double limite) {
		super(valorInicial, numero, senha);
		this.credito = limite;
	}
	
	@Override
	public int sacar(double valor) {
		int resultadoOperacao = 1;
		
		if(!(valor > (credito + getSaldo()) )) {
			this.setSaldo(getSaldo() - valor );
			resultadoOperacao = 0;
		}
		
		return resultadoOperacao;
	}

}
