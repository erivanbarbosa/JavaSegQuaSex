package servico;

import java.util.Collection;

import dao.LivroDao;
import modelo.Livro;

public class LivroServico {
	LivroDao dao = new LivroDao();
	
	public Collection<Livro> listarTodos() {
		return dao.listar();
	}
}
