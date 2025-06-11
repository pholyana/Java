package Exercicio01;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
			Scanner input =new Scanner(System.in);
			System.out.println("Digite um numero : "); 
			int n1 = input.nextInt();
			
			/*if (n1 == 1) { System.out.println("hoje é domingo"); }
			else if (n1==2) {System.out.println("hoje é segunda");}
			else if (n1==3) {System.out.println("hoje é terça");}
			else if (n1==4) {System.out.println("hoje é quarta");}
			else if (n1==5) {System.out.println("hoje é quinta");}
			else if (n1==6) {System.out.println("hoje é sexta");}
			else if (n1==7) {System.out.println("hoje é sabado");}
			else {System.out.println("numero inválido");}*/
			
			switch (n1) {
			case 1:
				System.out.println("domingo");
				break;
			case 2 :
				System.out.println("segunda");
				break;
			case 3 :
				System.out.println("terça");
				break;
			case 4 :
				System.out.println("quarta");
				break;
			case 5 :
				System.out.println("quinta");
				break;
			case 6 :
				System.out.println("sexta");
				break;
			case 7 :
				System.out.println("sabado");
				default :
					System.out.println("numero inválido");}

	}

}
