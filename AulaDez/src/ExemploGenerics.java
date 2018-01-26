
public class ExemploGenerics {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		
		System.out.println("O maior elemento de intArray é: " + maximo(intArray));
		System.out.println("\nO maior elemento de doubleArray é: " + maximo(doubleArray));

	}

	private static <T extends Comparable> T maximo(T[] array) {
		
		T maior = array[0];
		
		for( T elemento : array ) {
			if (elemento.compareTo(maior) > 0) {
				maior = elemento;
			}
		}
		
		return maior;
	}		
}
