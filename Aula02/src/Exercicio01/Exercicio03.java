package Exercicio01;

import java.util.Scanner;

public class Exercicio03 {
				public static void main(String[] args) {
					Scanner input = new Scanner(System.in);
					System.out.println("Digite uma nota : ");
					double nota= input.nextDouble();
					System.out.println("digite mais uma nota");
					double nota2=input.nextDouble();
					double soma=(nota+nota2)/2;
					System.out.printf("a media das notas é %f ", soma);
				}

}
