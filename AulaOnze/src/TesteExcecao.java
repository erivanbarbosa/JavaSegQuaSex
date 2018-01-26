import java.io.IOException;

public class TesteExcecao {

	public static void main(String[] args) {
		

			try {
				divisao(4, 0 );
			} 
			catch (Exception e) {
				e.printStackTrace();;
			}

		
		
		
	}

	
	public static Double divisao(double x, double y) throws Exception {
		if( y == 0 ) {
			Exception excecao = new Exception("Erro de divisão por zerooooo");
			
			throw excecao;
		}
		
		return x / y;
	}
}
