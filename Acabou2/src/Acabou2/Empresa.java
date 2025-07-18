package Acabou2;

public class Empresa {
	public static void main(String[] args) {
		Gerente g1 = new Gerente("Pholy",5000);
		Programador p1 = new Programador ("Gustavo",5000);
		
		
		double salarioProgramador= p1.calcularSalario(p1.Calcularbonus());
		System.out.printf("o salario de %S é %.2f", p1.nome,salarioProgramador);
		
	}		
			
}
