
public class TesteDoWhile {
	
	public static void main(String[] args) {
		int contador = 10;
		
		// Executa o bloco e ap�s executar testa se a condi��o � verdadeira
		// e executa o bloco novamente caso seja.
		// Sempre executa pelo menos uma vez.
		do {
			System.out.println(contador);
			contador++;
		}while(contador <10);
	}
}
