package Acabou;


	class Ciclista extends Atleta {
		Ciclista(String nome, int idade){
			super(nome, idade);
		}
	
		public void Pedalar() {
			System.out.println(nome + " está pedalando");
		}
	public void ParardePedalar() {
			System.out.println(nome + " parou de pedalar");
}}
