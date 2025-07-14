package Encapsulamento;

public class TesteNumeros {

	public static void main(String[] args) {
		Numeros c1 = new Numeros();
		c1.ajustarvalor(20);
		int retorno = c1.mostravalor();
		System.out.println(retorno);

	}

}
