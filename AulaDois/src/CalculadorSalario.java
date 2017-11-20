import java.util.Scanner;

public class CalculadorSalario {
	public static void main(String[] args ) {
		int horasTrabalhadas;
		double valorHoraTrabalhada;
		double percentualDesconto, totalDescontoSalario;
		double salarioBruto, salarioLiquido;
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de horas trabalhada: ");
		horasTrabalhadas = leitor.nextInt();
		
		System.out.println("Digite o valor da hora trabalhada: ");
		valorHoraTrabalhada = leitor.nextDouble();
		
		System.out.println("Digite o percentual de desconto: ");
		percentualDesconto = leitor.nextDouble();
		
		salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
		totalDescontoSalario = (percentualDesconto/100) * salarioBruto;
		salarioLiquido = salarioBruto - totalDescontoSalario;
		
		System.out.println("A quantidade de horas trabalhadas foi: " + horasTrabalhadas);
		System.out.println("A valor do salário bruto é: " + salarioBruto);
		System.out.println("O valor total do desconto foi: " + totalDescontoSalario);
		System.out.println("O valor do salário liquido é: " + salarioLiquido);


	}
}
