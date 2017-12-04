package exemploCarro;

public class Veiculo {
	private String cor;
	private int ano;
	private String identificacao;
	
	public Veiculo(String cor, int ano, String identificacao) {
		this.cor = cor;
		this.ano = ano;
		this.identificacao = identificacao;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	public void mover() {
		System.out.println("Veiculo se movendo!");
	}
	
}
