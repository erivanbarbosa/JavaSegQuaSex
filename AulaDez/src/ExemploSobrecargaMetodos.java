
public class ExemploSobrecargaMetodos {

	public static void main(String[] args) {
		int[] intArray = {1, 2, 3, 4};
		double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
		char[] charArray = {'A', 'B', 'c', 'D'};
		
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);

	}

	private static void printArray(int[] intArray) {
		System.out.println("Imprindo intArray");
		
		for( int elemento : intArray ) {
			System.out.printf("%s, ", elemento);
		}
		
		System.out.println();	
	}
	
	private static void printArray(double[] doubleArray) {
		System.out.println("Imprimindo doubleArray");
		for( double elemento : doubleArray ) {
			System.out.printf("%s, ", elemento);
		}
		
		System.out.println();	
	}
	
	private static void printArray(char[] charArray) {
		System.out.println("Imprimindo charArray");
		
		for( char elemento : charArray ) {
			System.out.printf("%s, ", elemento);
		}
		
		System.out.println();	
	}

	
	
}
