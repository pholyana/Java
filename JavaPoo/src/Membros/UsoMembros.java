package Membros;

public class UsoMembros {
	public static void main(String[] args) {
		DatadeNascimento dt = new DatadeNascimento();
		DatadeNascimento dt2 = new DatadeNascimento();
		dt.dia=10;
		dt.mes=03;
		dt.ano=2004;
		dt2.dia=13;
		dt2.mes=03;
		dt2.ano=2000;
		System.out.printf("A data de nascimento" + "é %d %d %d \n", dt.dia, dt.mes,dt.ano);
		
		System.out.printf("A data de nascimento "+ "é %d %d %d ", dt2.dia,dt2.mes,dt2.ano);
		
	}

}
