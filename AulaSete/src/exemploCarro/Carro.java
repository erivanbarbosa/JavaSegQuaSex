package exemploCarro;

public class Carro extends Veiculo{
	
	private String modelo;
	
	public Carro(String cor, int ano, String placa, String modelo ) {
		super(cor, ano, placa);
		
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	@Override
	public void mover() {
		System.out.println("Correndo!");
	}
	
	
}
