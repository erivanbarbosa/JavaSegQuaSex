package interfaces;

public class TestePalco {

	public static void main(String[] args) {
		Palco palco = new Palco();
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("João");
		
		System.out.println(palco.apresentar(pessoa));
		System.out.println();
		
		
		Caixa caixa = new Caixa();
		
		System.out.println(palco.apresentar(caixa));

	}

}
