package ListaExercicio01;

public class Contabancaria {
	
	 		private String numeroconta;
	 		private double saldo;

			
			
			public String getNumeroconta() {
				return numeroconta;
			}
			public void setNumeroconta(String numeroconta) {
				this.numeroconta = numeroconta;
			}
			public double getSaldo() {
				return saldo;
			}
			public void setSaldo(double saldo) {
				this.saldo = saldo;
			}
			public void saqueconta(double valor) {
				if (saldo > 0 && saldo>= valor) {
					this.saldo-=valor;
				} else {
					System.out.println("Não há valor na sua conta");
				}
				
			}
			public void depositoconta(double valor) {
				if (valor > 0) {
					this.saldo+=valor;
				} else {
					System.out.println("deposite um valor valido");
				}
			}
			
}
