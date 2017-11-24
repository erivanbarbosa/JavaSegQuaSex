import java.util.Arrays;

public class UniaoVetores {

	public static void main(String[] args) {
		int[] vetor1 = {1, 3, 6, 7};
		int[] vetor2 = {3, 0, 4, 1};
		int[] soma = vetor1;
		 soma = Arrays.copyOfRange(vetor2, 4, 7);
		
		
		// Método Arrays.toString() devolve uma string que representa o array soma
		System.out.println(Arrays.toString(vetor2));

	}

}
