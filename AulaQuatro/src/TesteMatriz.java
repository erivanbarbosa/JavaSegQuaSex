
public class TesteMatriz {

	public static void main(String[] args) {
		//declara e instancia uma matriz de tamanho 5 x 5
		int[][] matriz = new int[5][5];
		
		//itera pela linha da matriz
		for(int i = 0; i < matriz.length; i++ ) {
			// itera pela coluna da matriz
			for(int j = 0; j < matriz[0].length; j++) {
				//preenche o elemento da matriz na posição i, j
				matriz[i][j] = ((i + 1) * j - 1 + 4);
				
				System.out.print(matriz[i][j]);
			}
			//Desce a linha após escrever todos os elementos
			// da linha corrente.
			System.out.println();
		}
	}

}
