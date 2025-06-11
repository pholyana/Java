package Exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner entrada = new Scanner(System.in);
				System.out.println("Digite um numero : ");
				int num1=entrada.nextInt();
				System.out.println("Digite um numero : ");
				int num2=entrada.nextInt();
				System.out.println("Digite um numero : ");
				int num3=entrada.nextInt();
				
				
				/*if (num1 > num2 && num1 >num3) {
				System.out.printf("se o numero %d é maior que %d" ,num1); }
				
				else if (num2 > num1 && num2 > num3) {
					System.out.printf("o numero maior que %d" , num2);}
					
					else {
						System.out.printf(" o maior que %d" , num3);
					} */
						int resultado=(num1 > num2 && num1 > num3 ? num1:num2 > num1 && num2 > num3 ? num2:num3); 
						System.out.printf(" o maior numero é %d", resultado);
				}
				
				
}


