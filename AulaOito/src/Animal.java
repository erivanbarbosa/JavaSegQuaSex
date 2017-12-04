
public abstract class Animal {
	private String ruido;
	
	public Animal(String ruido ) {
		this.ruido = ruido;
	}
	
	public abstract void fazerRuido();
	public abstract void comer();

	public String getRuido() {
		return ruido;
	}

	public void setRuido(String ruido) {
		this.ruido = ruido;
	}
}
