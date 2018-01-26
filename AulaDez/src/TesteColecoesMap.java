import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TesteColecoesMap {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		
		set.add(new String("Duke"));
		list.add(new String("Duke"));
		
		set.add(new String("Duke") );
		list.add(new String("Duke"));
		
		set.add(new String("Duke") );
		list.add(new String("Duke"));
		
		for(String elemento : set ) {
			System.out.println(elemento);
		}
		
		System.out.println();
		
		for(String elemento : list ) {
			System.out.println(elemento);
		}

	}

}
