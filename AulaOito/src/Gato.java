
public class Gato extends Felino{

	public Gato() {
		super("Miaaaau miau!");
	}

	@Override
	public void fazerRuido() {
		System.out.println("Miado: " + this.getRuido());
	}
	
	@Override
	public void comer() {
		System.out.println("Come rato!");
	}
	
	
	
}
