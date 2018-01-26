package classes;

public class ModificadoresDeAcesso {

	
	
	public static void main(String[] args) {
		Cachorro meuCachorro = new Cachorro("Pequeno", "Pit Bull", "Verde");
		meuCachorro.setNome("Toddy");
		
		System.out.println("Raça do cachorro: " + meuCachorro.getRaca());
		System.out.println("Porte do cachorro: " +meuCachorro.getPorte());
		System.out.println("Cor do cachorro: " +meuCachorro.getCor());
		
		System.out.println();
		System.out.println(meuCachorro.latir());
		System.out.println(meuCachorro.correrEUivar());
	}
	
}
