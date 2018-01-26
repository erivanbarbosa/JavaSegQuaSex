import java.util.Arrays;

public class ImprimeArray {

	public static void main(String[] args) {
		Integer[] valoresInteiro = {1, 3, 5, 7, 9};
		Double[] valoresDouble = {1.1, 2.2, 3.3, 4.4};
		String[] valoresString = {"pato", "galinha", "sapo", "girafa"};
		
		imprimeArray(valoresInteiro);
		imprimeArray(valoresDouble);
		imprimeArray(valoresString);
	}
	
	public static <T> void imprimeArray(T[] numeros ) {
		System.out.println("Tamanho do Array: " + numeros.length);
		System.out.println(Arrays.toString(numeros));
	}
	
/*	public static void imprimeArray(double[] numeros ) {
		System.out.println(Arrays.toString(numeros));
	}
	
	public static void imprimeArray(String[] numeros ) {
		System.out.println(Arrays.toString(numeros));
	}*/

}
