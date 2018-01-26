import java.util.ArrayList;

public class Zoologico {
	ArrayList<Animal> animais;
	
	public Zoologico() {
		animais = new ArrayList<Animal>();
	}
	
	public void adicionarAnimal(Animal novoAnimal ) {
		animais.add(novoAnimal);
	}
	
	public ArrayList<Animal> getAnimais() {
		return animais;
	}
}
