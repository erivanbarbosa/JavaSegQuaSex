package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import model.Livro;
import util.FabricaConexao;

public class LivroDao {
	Logger LOG = Logger.getGlobal();
	
	private final String CONSULTAR_POR_ID_SQL = "select autor, titulo, cod_livro, imagem, "
			+ "preco, descricao from estoque where " + "cod_livro = ?";
	
	private final String CONSULTAR_SQL  = "select * from estoque where titulo like ?";

	public Livro consultar(int codigo) {
		Livro livro = new Livro();

		try {
			Connection conexao = FabricaConexao.getConexao();
			PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_POR_ID_SQL);

			consulta.setInt(1, codigo);

			ResultSet resultado = consulta.executeQuery();

			if (resultado.next()) {
				livro.setCodigo(resultado.getInt("cod_livro"));
				livro.setTitulo(resultado.getString("titulo"));
				livro.setAutor(resultado.getString("autor"));
				livro.setPreco(resultado.getDouble("preco"));
				livro.setImagem(resultado.getString("imagem"));
				livro.setDescricao(resultado.getString("descricao"));
			}

			resultado.close();
		} catch (SQLException e) {
			LOG.severe( e.toString() );
		}

		return livro;
	}
	
	
	public List<Livro> consultar(String titulo ) {
		Connection conexao;
		ArrayList<Livro> lista = new ArrayList<Livro>();
		
		try {
			conexao = FabricaConexao.getConexao();
			
			PreparedStatement consulta = conexao.prepareStatement(CONSULTAR_SQL);

			consulta.setString(1,  "%" + titulo + "%");

			ResultSet resultado = consulta.executeQuery();
			
			while( resultado.next() ) {
				Livro livro = new Livro();
				
				livro.setCodigo(resultado.getInt("cod_livro"));
				livro.setTitulo(resultado.getString("titulo"));
				livro.setAutor(resultado.getString("autor"));
				livro.setPreco(resultado.getDouble("preco"));
				livro.setImagem(resultado.getString("imagem"));
				livro.setDescricao(resultado.getString("descricao"));
				
				lista.add(livro);
			}
		} catch (SQLException e) {
			LOG.severe( e.toString() );
		}
		
		return lista;
	}
}
