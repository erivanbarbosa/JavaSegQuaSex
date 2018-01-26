import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteColecoesIterador1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add(new String("Duke1"));
		list.add(new String("Duke2"));
		list.add(new String("Duke3"));
		
		Iterator<String> iterador = list.iterator();
		
		while( iterador.hasNext() ) {
			String elemento = iterador.next();
			
			if(elemento.equals("Duke1")) {
				iterador.remove();
			}	
		}
		
		for(String elemento : list ) {
			System.out.println(elemento);
		}
	}
}
