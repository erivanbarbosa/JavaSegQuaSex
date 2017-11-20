
public class TesteIf {

	public static void main(String[] args) {
		int nota = 60;
		
		if(nota >= 70 && nota <= 100) {
			System.out.println("Parabens, você foi aprovado!");
		}
		else if (nota >= 50) {
			System.out.println("Cuidado, você está de recuperaão");
		}
		else if (nota >= 0){
			System.out.println("Infelizmente você foi reprovado!");
		}
		else {
			System.out.println("A nota informada é inválida");
		}

		
		System.out.println("Fim do programa!");

	} // fim da main

} //fim da classe
