
public class Teste {
 public static void main(String[] args) {
	final String nomequalquer;
	 
	 Zoologico zoo = new Zoologico();
	Animal animal2 = new Macaco(5.2, 10d, 2, "verde");
	Animal animal3 = new Macaco(5.2, 10d, 2, "verde");
	Object animal4 = new Macaco(5.2, 10d, 2, "verde");
	
	
	nomequalquer = "asdf";
	
	System.out.println();
	
	//System.out.println(animal2.getClass().getSimpleName() );
	
	System.out.println(animal4 instanceof Macaco);
}
}
