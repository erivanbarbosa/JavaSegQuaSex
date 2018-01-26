import java.util.ArrayList;

public class Pilha<T> {
	ArrayList<T> lista = new ArrayList<T>();
	
	public void push(T elemento) {
		lista.add(elemento);
	}
	
	public T pop() {
		T resultado = lista.get(lista.size());
		lista.remove(lista.size());
		
		return resultado;
	}
	
	
}
