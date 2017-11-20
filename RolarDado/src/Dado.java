import java.util.Random;

public class Dado {
	private int numeroFaces;
	private Random aleatorio = new Random();
	
	
	
	public Dado (int numFaces) {
		numeroFaces = numFaces; 
	}

	public int rolar() {
		int resultado = aleatorio.nextInt(numeroFaces) + 1;
		return resultado ;
	}
	
	
}
