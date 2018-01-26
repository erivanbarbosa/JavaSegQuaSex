
public class Macaco extends Felino{
	private double comprimentoCauda;
	
	public Macaco( double comprimentoCauda, double peso, int idade, String cor ) {
		super( peso, idade, cor );
		
		this.comprimentoCauda = comprimentoCauda;
	}

	@Override
	public void mover() {
		System.out.println("Pulando de galho em galho");
	}
	
	
	public void pular() {
		System.out.println("macaco pulando!");
	}

	@Override
	public void fazerRuido() {
		System.out.println("miaaaaaaaaau");
		
	}

	@Override
	public void comer() {
		System.out.println("Come sardinha");
		
	}

}
