import java.util.Arrays;

public class TesteArrays {
	public static void main(String[] args) {
		int[] numeros = {5, 8, 6, 4, 7, 11, 12, 10};
		
		int[] numeros2 = numeros;
		
		System.out.println(Arrays.toString(numeros2));
		
		Arrays.sort(numeros);
		System.out.println( Arrays.toString(numeros) );
		
		int num = Arrays.binarySearch(numeros, 6 );
		
		System.out.println(numeros[num]);
		
	}
}
