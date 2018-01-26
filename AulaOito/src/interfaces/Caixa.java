package interfaces;

public class Caixa implements Cantor{
	private int tamanho;

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public String cantar() {
		return "la la lari la ri la la";
	}
	
	
}
