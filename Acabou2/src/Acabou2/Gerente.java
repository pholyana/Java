package Acabou2;

public class Gerente extends Funcionarios implements Bonificavel{
				double bonus,salario;
	public Gerente(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public double Calcularbonus() {
		bonus=this.salarioBase=salarioBase*0.2;
		return bonus;
		
		
	}

	@Override
	public double calcularSalario() {
		
		return salarioBase+bonus;
	}


	

}
