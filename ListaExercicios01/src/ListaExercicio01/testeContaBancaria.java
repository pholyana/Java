package ListaExercicio01;

public class testeContaBancaria {
			public static void main(String[] args) {
				Contabancaria minhaconta= new Contabancaria();
				minhaconta.setNumeroconta("123456");
				minhaconta.depositoconta(3000);
				minhaconta.saqueconta(1000);
				System.out.println(minhaconta.getSaldo());
			}
}
