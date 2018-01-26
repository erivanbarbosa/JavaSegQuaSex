package interfaces;

public class Palco {
	
	//M�todo aprensentar exibe uma mensagem de aprensenta��o
	// do canto recebido
	public String apresentar(Cantor cantor ) {
		String nome = "";
		
		if (cantor instanceof Pessoa) {
			Pessoa pessoa = (Pessoa) cantor;
			
			nome = pessoa.getNome();
		}
		
		
		return "Agora com voc�s o cantor " + nome;
	}
}
