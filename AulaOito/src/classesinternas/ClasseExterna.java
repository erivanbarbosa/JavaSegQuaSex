package classesinternas;


public class ClasseExterna {
	
	public class ClasseInterna {
		public String saudacao() {
			return "Olá";
		}
	}
	
	public String saudacaoExterna(  ) {

	ClasseInterna ci = new ClasseInterna();
	String texto = ci.saudacao();
	
	return texto;	
	}
	
	public static void main(String[] args) {
		ClasseExterna ce = new ClasseExterna();
		
		System.out.println(ce.saudacaoExterna());
	}
	
	
}
