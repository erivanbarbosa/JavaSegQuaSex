/*Faça um algoritmo que some o conteúdo de dois vetores
e armazene o resultado em um terceiro vetor. */

import java.util.Arrays;

public class SomaVetores {
public static void main(String[] args) {
	int[] vetor1 = {1, 3, 6, 7};
	int[] vetor2 = {3, 0, 4, 1};
	int[] soma = new int[4];
	
	//itera pela array e soma os valores das posições de mesmo indice
	for(int i = 0; i < vetor1.length; i++) {
		soma[i] = vetor1[i] + vetor2[i];
	}
	
	// Método Arrays.toString() devolve uma string que representa o array soma
	System.out.println(Arrays.toString(soma));
}
}
