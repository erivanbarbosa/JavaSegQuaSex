
public abstract class Animal {
	private double peso;
	private int idade;
	private String cor;
	private String ruido;
	
	
	
	public Animal(double peso, int idade, String cor) {
		super();
		this.peso = peso;
		this.idade = idade;
		this.cor = cor;
	}

	public abstract void fazerRuido();
	
	public abstract void comer();
	
	public void dormir() {
		System.out.println("Animal está dormindo!");
	}

	public void mover() {
		System.out.println("Animal está movendo!");
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getRuido() {
		return ruido;
	}


	public void setRuido(String ruido) {
		this.ruido = ruido;
	}
	
	

}
