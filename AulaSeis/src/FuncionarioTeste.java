
public class FuncionarioTeste {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("José", "Silva", 400.00);
		
		System.out.println("Nome do funcionario: " + funcionario.getNome()
				+ " " + funcionario.getSobrenome() );
		System.out.println("Salario: " + funcionario.getSalario());
		System.out.println("Salario anual: " + (funcionario.getSalario() * 12));

		double salarioReajustado = funcionario.getSalario() + funcionario.getSalario() * 0.10;
		
		funcionario.setSalario(salarioReajustado);
		
		System.out.println();
		
		System.out.println("Salario após reajuste: " + funcionario.getSalario());
		System.out.println("Salario anual após o reajuste " + 
		(funcionario.getSalario() * 12));
	}

}
