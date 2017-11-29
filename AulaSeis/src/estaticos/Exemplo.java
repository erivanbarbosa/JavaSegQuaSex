package estaticos;

public class Exemplo {
	public static void main(String[] args) {
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		Carro carro3 = new Carro();
		
		System.out.println(Carro.getContadorInstancia());
	}
}
