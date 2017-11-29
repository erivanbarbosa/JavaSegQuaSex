
public class PassagemPorReferencia {

	public static void main(String[] args) {
		int[] idades = {10, 11, 12 };
		
		for( int i = 0; i < idades.length; i++ ) {
			System.out.println(idades[i]);
		}

		teste(idades);
		
		System.out.println();
		
		for( int i = 0; i < idades.length; i++ ) {
			System.out.println(idades[i]);
		}
		
	}
	
	public static void teste (int[] arr) {
		for( int i = 0; i < arr.length; i++ ) {
			arr[i] = i + 50;
		}
	}

}
