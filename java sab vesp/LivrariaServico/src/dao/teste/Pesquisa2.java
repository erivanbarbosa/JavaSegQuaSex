package dao.teste;

import dao.LivroDao;
import model.Livro;

public class Pesquisa2 {
	public static void main(String[] args) {
		LivroDao dao = new LivroDao();
		Livro livroResultado = dao.consultar(11);
		
		System.out.println(livroResultado.getTitulo());
		
		System.out.println(livroResultado.getAutor());
		System.out.println(livroResultado.getPreco());
		System.out.println(livroResultado.getImagem());
		System.out.println(livroResultado.getDescricao());
	}
}
