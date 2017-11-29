
public class Personagem {
	private String skin;
	private Arma arma;
	private int vida;
	
	public Personagem() {
		arma = new Arma(5);
		vida = 1;
	}
	
	public void atirar() {
		if(arma.getMunicao() > 0 ) {
			System.out.println("paaaaaaaaa!!!!!");
			arma.setMunicao(arma.getMunicao()-1);
		}
		else {
			System.out.println("clec clec");
		}
	}
	
	public void correr() {
		System.out.println("correndo");
	}
	
	public void pular() {
		System.out.println("pulando");
	}
	
	
	public String getSkin() {
		return skin;
	}
	public void setSkin(String skin) {
		this.skin = skin;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	
	
}
