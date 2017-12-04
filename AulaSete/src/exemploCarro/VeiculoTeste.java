package exemploCarro;

public class VeiculoTeste {

	public static void main(String[] args) {
		Carro carro = new Carro("Verde", 2017, "kgb-3252", "SUV");
		Aviao aviao = new Aviao("azul", 1989, "545444125", "teco teco");
		
		/*System.out.println("Cor do carro: " + carro.getCor());
		System.out.println("Ano do carro: " + carro.getAno());
		System.out.println("Placa do carro: " + carro.getIdentificacao());
		System.out.println("Modelo do carro: " + carro.getModelo());*/
		
		carro.mover();
		aviao.mover();
		
		estacionar(carro);
		estacionar(aviao);
		
		
	}
	
	public static void estacionar(Veiculo veiculo ) {
		System.out.println("Estacionando o veiculo!");
	}
	


}
