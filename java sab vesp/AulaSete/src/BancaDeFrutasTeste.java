
public class BancaDeFrutasTeste {
	public static void main(String[] args) {
		BancaDeFrutas banca = new BancaDeFrutas();
		
		Banana banana = new Banana("VERDE");
		Melancia melancia = new Melancia("Verde");
		
		System.out.println(banca.exibirFruta(banana));
		System.out.println(banca.exibirFruta(melancia));
	}
}
