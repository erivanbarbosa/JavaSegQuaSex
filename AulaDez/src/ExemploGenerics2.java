
public class ExemploGenerics2 {

	public static void main(String[] args) {
		Integer[] intArray = {1, 2, 3, 4};
		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		Character[] charArray = {'A', 'B', 'c', 'D'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);

	}

	private static <T> void printArray(T[] array) {
		System.out.println("Escrevendo o array");
		
		for( T elemento : array ) {
			System.out.printf("%s, ", elemento);
		}
		
		System.out.println();	
	}		
}
