package Encapsulamento;

public class TesteAnimal {
	public static void main(String[] args) {
		AnimalEstimacaoa animal1 = new AnimalEstimacaoa();
		animal1.ajustarnome("pacoca");
		animal1.mudarnome();
		System.out.println(animal1.mudarnome());
	}

}
