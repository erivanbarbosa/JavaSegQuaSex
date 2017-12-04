package exemploCarro;

public class Aviao extends Veiculo{
	private String modelo;

	public Aviao(String cor, int ano, String identificacao, String modelo) {
		super(cor, ano, identificacao);
		this.modelo = modelo;
	}
	
	@Override
	public void mover() {
		System.out.println("Voando!");
	}
	

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	
	
	
}
