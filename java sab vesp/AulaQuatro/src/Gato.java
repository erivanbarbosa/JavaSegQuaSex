
public class Gato extends Felino {

	private double comprimentoCauda;

	public Gato(double comprimentoCauda, double peso, int idade, String cor) {
		super(peso, idade, cor);

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
