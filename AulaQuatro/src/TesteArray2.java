
public class TesteArray2 {
	public static void main(String[] args) {
		int[] numeros = new int[10];
		
		for(int i = 1; i < numeros.length; i++ ) {
			numeros[i] = i * 5;
			
			System.out.println(numeros[i]);
		}
	}
}
