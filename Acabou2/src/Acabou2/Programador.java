package Acabou2;

public class Programador extends Funcionarios implements Bonificavel {
					double salario,bonus;
	public Programador(String nome, double salario) {
		super(nome, salario);
		
	}

	@Override
	public double Calcularbonus() {
		bonus=this.salarioBase*0.1;
		return bonus;
		
		
	}

	@Override
	public double calcularSalario(double bonus) {
	
		return salario=this.salarioBase+bonus;
	}

}
