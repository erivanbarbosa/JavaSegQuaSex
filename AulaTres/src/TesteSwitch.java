
public class TesteSwitch {

	public static void main(String[] args) {
		int mes = 12;
		
		switch(mes) {
		case 12: 
		case 1:
		case 2:
			System.out.println("Ver�o");
			break;
			
		case 3:
		case 4:
		case 5:
			System.out.println("Outono");
			break;
		
		case 6:
		case 7:
		case 8:
			System.out.println("Inverno");
			break;
		
		case 9:
		case 10:
		case 11:
			System.out.println("Primavera");
			break;
			
		default:
			System.out.println("Mes inv�lido!");
		}

		System.out.println("Fim do programa!");
	}

}
