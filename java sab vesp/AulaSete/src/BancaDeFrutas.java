
public class BancaDeFrutas {
	public <T extends Fruta> String exibirFruta( T fruta ) {
		String resultado = fruta.getClass().getSimpleName() + " " + fruta.getCor();
		
		return resultado;
	}
}
