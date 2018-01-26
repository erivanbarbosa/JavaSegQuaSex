
public class ExemploArray {

	public static void main(String[] args) {

		int[] array = { 1, 5, 4, 6, 7 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println();
		
		dobrar(array);

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void dobrar(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor[i] * 2;
		}
	}

}
