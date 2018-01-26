import java.util.Arrays;

public class ExemploArrays {

	public static void main(String[] args) {
		int[] numeros = {3, 12, 1, 0, 8, 4, 6, 2 };
		
		String teste = new String();
		
		System.out.println(Arrays.toString(numeros));
		
		Arrays.sort( numeros, -1, 7 );
		
		System.out.println(Arrays.toString(numeros));

	}

}
