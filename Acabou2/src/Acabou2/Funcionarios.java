package Acabou2;

public  abstract class Funcionarios {
	String nome;
	double salarioBase;

	
		public Funcionarios(String nome, double salario) {
			this.nome=nome;
			this.salarioBase=salario;
		}
		
		public abstract double calcularSalario(double bonus);
		
}

