import java.util.Scanner;

public class OrdenaNumeros {

	public static void main(String[] args) {
		int num1, num2, num3, aux;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o numero1 : ");
		num1 = input.nextInt();
		
		System.out.println("Informe o numero2 : ");
		num2 = input.nextInt();
		
		System.out.println("Informe o numero3 : ");
		num3 = input.nextInt();
		
		if(num1 > num2 ) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		
		if(num1 > num3) {
			aux = num1;
			num1 = num3;
			num3 = aux;
		}
		
		if( num2 > num3) {
			aux = num2;
			num2 = num3;
			num3 = aux;
		}
		
		System.out.printf("%d, %d, %d", num1, num2, num3);
		

	}

}
