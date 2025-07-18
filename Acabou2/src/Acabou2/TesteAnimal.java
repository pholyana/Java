package Acabou2;

public class TesteAnimal {
			public static void main(String[] args) {
				Gato animal01=new Gato("floquinho");
				String Animais[]= {"caramelo", "flor", "juju","mimi"};
				for(String n: Animais) {
					animal01.emitirSom(n);
				}
			}
}
