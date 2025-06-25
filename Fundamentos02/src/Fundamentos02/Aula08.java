package Fundamentos02;

import java.util.Scanner;

public class Aula08 {
	public static void main(String[] args) {
		double soma=0, media=0;
		int qtndadeAlunos=0;
		Scanner imput=new Scanner(System.in);
		System.out.println("quantos alunos há na sala ? fala logo!:");
		qtndadeAlunos=imput.nextInt();
		for (int i=0; i < qtndadeAlunos; i++) {
			System.out.println("agora digite a nota? mais rápido o possível:");
			soma+=imput.nextDouble();
		
			
		}
		media=soma/qtndadeAlunos;
			
			System.out.println(media > 7 ?"Aprovados": "Rprovados");
			
					
		}
	}


