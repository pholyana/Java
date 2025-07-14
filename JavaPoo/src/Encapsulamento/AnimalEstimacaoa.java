package Encapsulamento;

public class AnimalEstimacaoa {
	private  String nome;
	private  int idade;
	private  String raca;
	private String tipo;
	
	
	public void ajustarnome( String nome) {
		this.nome=nome;
	}
	
	public String mudarnome() {
		return nome;
	}
	
	
	
	

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void ajustaridade(int idade) {
		this.idade=idade;
	}
}
