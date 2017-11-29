import javax.swing.plaf.synth.SynthSeparatorUI;

public class Carro {
	
	//Propriedades (variáveis) da classe Carro
	//Todas são privadas
	private int ano;
	private String cor;
	private String modelo;
	private String placa;
	
	
	//Construtor inicializar o objeto carro no momento da criação
	public Carro(int ano, String cor, String modelo ) {
		this.ano = ano;
		this.cor = cor;
		this.modelo = modelo;
	}
	
	
	public void ligar() {
		String resultado = "Carro ligado!";
		
		System.out.println(resultado);;
	}
	
	public void acelerar() {
		System.out.println("Vrrruuuummm!!!!!!!!!!!!!");
	}
	
	public void frear() {
		System.out.println("Carro parado!");
	}
	

	//métodos get e set usados para recuperar e alterar os valores
	// das variáveis da classe carro
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	
}
