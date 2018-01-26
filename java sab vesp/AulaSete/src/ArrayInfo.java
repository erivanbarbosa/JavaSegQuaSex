import java.util.Arrays;

public class ArrayInfo {
	public <T> String descreverArray(T[] vetor) {
		String resultado = "";

resultado = "Tipo de Objeto: " + vetor.getClass().getSimpleName() + "\n";
resultado += "Tamanho: " + vetor.length + "\n";
resultado += "Conteúdo: " + Arrays.toString(vetor);

		return resultado;
	}
}
