
public class ProdutoTeste {

	public static void main(String[] args) {
		Produto produto1 = new Produto("Caixa de BIS", 3.50, 10 );
		Produto produto2 = new Produto("Panetone Bauduco", 23.50, 5 );
		
		System.out.println("Descricao: " + produto1.getDescricao());
		System.out.println("Valor: " + produto1.getPreco());
		System.out.println("Quantidade: " + produto1.getQuantidade());
		System.out.println("Valor total: " + produto1.calcularPrecoTotal());
		
		System.out.println();
		
		System.out.println("Descricao: " + produto2.getDescricao());
		System.out.println("Valor: " + produto2.getPreco());
		System.out.println("Quantidade: " + produto2.getQuantidade());
		System.out.println("Valor total: " + produto2.calcularPrecoTotal());
		
		

	}

}
