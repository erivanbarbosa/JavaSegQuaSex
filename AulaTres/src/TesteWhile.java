public class TesteWhile {
	// Método main inicia a execução do programa
	public static void main(String[] args) {
		//Variável que será utilizada para controlar as repetições
		int contador = 100;
		
		//Repete o bloco enquanto a variável  contador tiver
		//valor menor que 10.
		while(contador < 10 ) {
			System.out.println(contador);
			
			//Incrementa (aumenta) o valor do contador em 1.
			contador++;
		} // fim do while

	} // fim do main

} // fim da classe
