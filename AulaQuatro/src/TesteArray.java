
public class TesteArray {
	public static void main(String[] args) {
		// declara um array chamado numero
		// reservando 10 posições de memória
		// Não inicializa os valores 
		// (o java inicializa automticamente com zero)
		int[] numeros = new int[10];
		
		// cria um array chamado numeros2 e o inicializa
		// com 5 elementos
		// o array terá o tamanho igual a quantidade
		// de elementos
		int[] numeros2 = {11, 3, 5, 6, 7};
		
		System.out.println("O primeiro elemento do array numeros  é: " + numeros[0]);
		
		System.out.println("O primeiro elemento do array numeros2  é: " + numeros2[0]);
		
		// Exibe o tamanho dos arrays
		System.out.println("O tamanho do array numeros é: " + numeros.length);
		System.out.println("o tamanho do array numeros2 é: " + numeros2.length);
		
		
		for(int i = 0; i < numeros.length; i++ ) {
			System.out.println("O elemento " + i + " é: " + numeros[i]);
		}
		
		
		System.out.println();
		
		for(int i = 0; i < numeros2.length; i++ ) {
			System.out.println("O elemento " + i + " é: " + numeros2[i]);
		}
	}
}
