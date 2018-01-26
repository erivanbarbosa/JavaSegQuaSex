import java.util.HashMap;
import java.util.Map;

public class TesteColecoes {

	public static void main(String[] args) {
		Map<Integer, Object> set = new HashMap<Integer, Object>();
		
		set.put(2, new String("Duke2"));
		set.put(1, new String("Duke1"));
		set.put(3, new String("Duke3"));
		
		
		
		System.out.println(set.get(3));
		


	}

}
