
public class TesteParametroPorValor {

	public static void main(String[] args) {
		int numero = 10;
		
		System.out.println(numero);
		
		teste(numero);
		
		System.out.println(numero);

	}
	
	public static void teste(int num) {
		num = 50;
	}

}
