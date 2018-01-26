package dao.teste;

import java.util.List;

import dao.LivroDao;
import model.Livro;

public class Pesquisa {
	public static void main(String[] args) {
		String titulo = "CASSINO";
		LivroDao dao = new LivroDao();
		List<Livro> lista = dao.consultar(titulo);
		
		for( Livro livro : lista ) {
			System.out.println("Livro: " + livro.getTitulo());
			System.out.println("Autor: " + livro.getAutor());
			System.out.println("Preco: " + livro.getPreco());
			System.out.println("Imagem: " + livro.getImagem());
			System.out.println("Descricao: " + livro.getDescricao());
			
			System.out.println();
			System.out.println();
		}
	}
}
