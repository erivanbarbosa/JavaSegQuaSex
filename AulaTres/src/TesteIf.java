
public class TesteIf {

	public static void main(String[] args) {
		int nota = 60;
		
		if(nota >= 70 && nota <= 100) {
			System.out.println("Parabens, voc� foi aprovado!");
		}
		else if (nota >= 50) {
			System.out.println("Cuidado, voc� est� de recupera�o");
		}
		else if (nota >= 0){
			System.out.println("Infelizmente voc� foi reprovado!");
		}
		else {
			System.out.println("A nota informada � inv�lida");
		}

		
		System.out.println("Fim do programa!");

	} // fim da main

} //fim da classe
