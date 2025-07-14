package ListaExercicio01;

public class Aluno {
	String nome;
	 private double nota1, nota2 , media;
	 private  String getname() {
		 return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getmedia(double media) {
		this.media=(this.nota1+this.nota2/2);
	
	} public boolean isAprovado() {
		if (getmedia >=6) {
			System.out.println("voce está aprovado");
		}
	}
	
	

}
