
public class Produto {
	//Atributos
	private String descricao;
	private int quantidade;
	private double preco;
	
	//Construtores
	public Produto(String descricao, double preco ) {
		this.descricao = descricao;
		setPreco(preco);
	}
	
	public Produto(String descricao, double preco, int quantidade) {
		this.descricao = descricao;
		setPreco(preco);
		setQuantidade(quantidade);
	}
	
	
	public double calcularPrecoTotal() {
		return preco * quantidade;
	}
	
	//Métodos get e set
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		if(quantidade >= 0 ) {
			this.quantidade = quantidade;
		}
		else {
			this.quantidade = 0;
		}
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		if(preco >= 0 ) {
			this.preco  = preco;
		}
		else {
			this.preco = 0.0;
		}
	}
	
	
}
