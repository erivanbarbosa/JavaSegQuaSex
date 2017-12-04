package exemploCarro;

public class ColecaoVeiculos {
	public static void main(String[] args) {
		Veiculo[] veiculos = new Veiculo[4];
		
		veiculos[0] = new Carro("verde", 2017, "nkz-8383", "SUV");
		veiculos[1] = new Aviao("amarelo", 1898, "nkz-8383", "SUV");
		veiculos[2] = new Carro("azul", 2011, "nkz-8383", "SUV");
		veiculos[3] = new Aviao("branco", 2005, "nkz-8383", "SUV");
		
		System.out.println(veiculos[0].getClass().getSimpleName());
		System.out.println(veiculos[1].getClass().getSimpleName());
		System.out.println(veiculos[2].getClass().getSimpleName());
		System.out.println(veiculos[3].getClass().getSimpleName());
		
		System.out.println();
		
		System.out.println(veiculos[0] instanceof Carro);
		System.out.println(veiculos[1] instanceof Aviao);
		System.out.println(veiculos[2] instanceof Aviao);
		System.out.println(veiculos[3] instanceof Carro);
	}
}
