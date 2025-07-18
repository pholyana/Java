package Acabou2;

public class TesteOperacao {
	public static void main(String[] args) {
		Soma soma01= new Soma();
		Multiplicacao mult1= new Multiplicacao();
		Subtracao sub1=new Subtracao();
		Divisao div1=new Divisao();
		double	resp1=soma01.calcular(10,2);	
		double	resp2=sub1.calcular(10,2);
		double	resp3=mult1.calcular(10,2);
		double	resp4=div1.calcular(10, 2);
		System.out.println(resp1);
		System.out.println(resp2);
		System.out.println(resp3);
		System.out.println(resp4);
	}

}
