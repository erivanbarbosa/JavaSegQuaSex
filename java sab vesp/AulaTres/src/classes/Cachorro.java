package classes;

public class Cachorro {
	private String raca;
	private String porte;
	private String cor;
	private String nome;
	
	
	public Cachorro(String porte, String raca, String cor ) {
		this.raca = raca;
		this.porte = porte;
		this.cor = cor;
	}
	
	
	public String correrEUivar() {
		String resultado = "";
		
		resultado = nome + " está correndo ";
		resultado += uivar();
		
		return resultado;
	}
	
	public String latir() {
		return "au au au!";
	}
	
	private String uivar() {
		return "auuuuuuuuuuuuu!!!!!!!!!!";
	}
	
	
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca.isEmpty() ? "Vira-Lata" : raca;
	}
}
