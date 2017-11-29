package estaticos;

public class Carro {
	
	//Propriedades (variáveis) da classe Carro
	//Todas são privadas
	private int ano;
	private String cor;
	private String modelo;
	private String placa;
	static int contador;
	
	
	//Construtor inicializar o objeto carro no momento da criação
	public Carro() {
		contador++;
		
		System.out.println("Criando carro!");
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
	
	public static int getContadorInstancia() {
		return contador;
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
