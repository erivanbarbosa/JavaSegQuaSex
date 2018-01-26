
public class Banana extends Fruta{
	public Banana(String cor ) {
		cor = cor.toLowerCase();
		
		if(cor.equals("verde") || cor.equals("amarela") || cor.equals("preta")) {
			setCor(cor);
		} else {
			setCor("amarela");
		}
	}
}
