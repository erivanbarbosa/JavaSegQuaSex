
public class ExemploGenerics3 {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		
		printArray(intArray);
		printArray(doubleArray);

	}

	private static <T extends Number> void printArray(T[] array) {
		
		Double soma = 0.0;
		
		for( T elemento : array ) {
			soma = soma + elemento.doubleValue();
		}
		
		System.out.printf("A soma dos elementos é: %.1f ", soma);
		System.out.println();
	}		
}
