
public class ExemploArray2 {

	public static void main(String[] args) {

		int[] array = { 1, 5, 4, 6, 7 };

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			dobrar(array[i]);
		}
		

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + ", ");
		}
	}

	public static void dobrar(int numero) {
		numero = numero * 2;
	}

}
