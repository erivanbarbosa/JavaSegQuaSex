
public abstract class Felino extends Animal {
	
	public Felino(double peso, int idade, String cor) {
		super(peso, idade, cor);
	}

	public void mover() {
		System.out.println("Movendo com 4 patas!");
	}
}
