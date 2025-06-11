package Aula01;

import java.util.Scanner;

public class Exercicio07 {
		public static void main(String[] args) {
			
			Scanner pergunta = new Scanner(System.in);
			System.out.println("mostre-me um valor?:");
			double resp = pergunta.nextDouble();
			System.out.println(resp < 0 ?"Negativo" : resp == 0 ? "Zero" : "Positivo");
		}

}
