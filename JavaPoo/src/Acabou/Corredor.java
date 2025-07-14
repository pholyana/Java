package Acabou;


	class Corredor extends Atleta {
		Corredor(String nome, int idade) {
			super(  nome,   idade);
		}
	
		public void correr() {
			System.out.println("está  correndo");
		}
		public void PararCorrer () {
			System.out.println(nome +  "parou de correr");
}}
