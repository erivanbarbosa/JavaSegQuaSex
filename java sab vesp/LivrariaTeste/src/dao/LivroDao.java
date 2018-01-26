package dao;

import java.util.ArrayList;
import java.util.Collection;

import modelo.Livro;

public class LivroDao {
	public Collection<Livro> listar() {
		ArrayList<Livro> livros = new ArrayList<>();
		
		for(int i = 0; i < 20; i++ ) {
			Livro livro = new Livro();
			livro.setNome("Livro " + i);
			livro.setAutor("Autor " + i);
			livro.setPreco(i * 5.0 + 1 );
			
			livros.add(livro);
		}
		
		return livros;
	}
}
