package polimorfismo;

public class Gato extends Animal {
			public Gato(String nome, int idade, String raca) {
				
						super(nome,idade,raca);
	}
			public void comer(String comida) {
				System.out.printf(" %S foi comer %s \n",nome,comida);
			}
			
}
