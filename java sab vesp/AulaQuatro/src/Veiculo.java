
public class Veiculo {
	private String cor;
	private int ano;
	private String identificacao;
	
	public Veiculo( String corVeiculo, int anoVeiculo, String idVeiculo ) {
		cor = corVeiculo;
		ano = anoVeiculo;
		identificacao = idVeiculo;
		
		System.out.println("Criando um objeto  veiculo!");
	}
	
	public void mover() {
		System.out.println("Veiculo está se movendo!");
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
	
	
	
}
