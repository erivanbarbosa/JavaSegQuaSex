package enumeradores;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta(0000, "Rudimar", 50000000d, EnumTipoConta.CORRENTE);
		
		Conta conta2 = new Conta(0001, "Erivan", -100d, EnumTipoConta.FACIL);
		Conta conta3 = new Conta(0043, "Pollyanna", 50000d, EnumTipoConta.POUPANCA);
		Conta conta4 = new Conta(0102, "Douglas", 50000d, EnumTipoConta.CORRENTE);
		

	}

}
