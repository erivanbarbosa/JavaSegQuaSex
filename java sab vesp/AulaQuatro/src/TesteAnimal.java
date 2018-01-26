
public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal = new Gato( 10.00, 2, 2, "azul");
		
		animal.comer();
		animal.dormir();
		animal.fazerRuido();
		
		System.out.println(animal.getCor());
		
	}

}


