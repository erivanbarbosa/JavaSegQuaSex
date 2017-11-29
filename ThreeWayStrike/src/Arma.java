
public class Arma {
	private String Modelo;
	private int municao;
	
	public Arma(int quantidadeMunicao ) {
		municao = quantidadeMunicao;
	}
	
	
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getMunicao() {
		return municao;
	}
	public void setMunicao(int municao) {
		this.municao = municao;
	}
	
	
}
