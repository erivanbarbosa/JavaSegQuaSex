import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteColecoesIterador2 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add(new String("Duke2"));
		list.add(new String("Duke3"));
		list.add(new String("Duke1"));
		
		Collections.sort(list);
		
		for( String elemento : list ) {
			System.out.println(elemento);
		}
		
	}
}
