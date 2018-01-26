
public class Carro extends Veiculo {
	private String modelo;
	
	public Carro(String cor, int ano, String placa, String modelo ) {
		super(cor, ano, modelo );
		
		this.modelo = modelo;
		
		System.out.println("Criando o objeto carro");
	}
	
	
	public void mover() {
		System.out.println("Correndo!");
	}


	public String getModelo() {
		return modelo;
	}
}
