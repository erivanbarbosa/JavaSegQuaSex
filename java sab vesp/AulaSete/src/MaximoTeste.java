
public class MaximoTeste {

	public static void main(String[] args) {
		
		Integer maior = maximo(2, 3, 1);
		
		System.out.println(maior);
		System.out.println(maximo("asdf", "fda", "kjkjkj"));
	}

	public static <T extends Comparable> T maximo(T i, T j, T k) {
		T resultado = i;
		
		if(j.compareTo( resultado ) > 0) {
			resultado = j;
		}
		if(k.compareTo( resultado ) > 0) {
			resultado = k;
		}
		
		return resultado;
	}
}
