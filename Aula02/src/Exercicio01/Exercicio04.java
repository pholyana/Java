package Exercicio01;

import java.util.Scanner;

public class Exercicio04 {
			public static void main(String[] args) {
				Scanner imput= new Scanner (System.in);
				char letra;
				System.out.println("Digite uma inicial do sexo:");
				letra =imput.next().charAt(0);
				System.out.println(letra == 'f' ? "feminino": "masculino");
				
				}
}
