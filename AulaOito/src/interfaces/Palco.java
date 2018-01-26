package interfaces;

public class Palco {
	
	//Método aprensentar exibe uma mensagem de aprensentação
	// do canto recebido
	public String apresentar(Cantor cantor ) {
		String nome = "";
		
		if (cantor instanceof Pessoa) {
			Pessoa pessoa = (Pessoa) cantor;
			
			nome = pessoa.getNome();
		}
		
		
		return "Agora com vocês o cantor " + nome;
	}
}
