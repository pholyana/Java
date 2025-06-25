package javmetodos;

public class LojaDeCarro {

	public static void main(String[] args) {
		Carros c1 = new Carros();
		
		c1.cor="preto";
		System.out.println(c1.cor);
		
		c1.modelo="honda civic";
		System.out.println(c1.modelo);
		
		c1.preco=69.000;
		System.out.println(c1.preco);
		
		Carros c2 = new Carros(25000, "gol bala");
		System.out.println(c2.modelo);
		System.out.println(c2.cor);
	}

}
