package Fundamentos02;

import java.util.Scanner;

public class Aula02 {
				public static void main(String[] args) {
					Scanner input = new Scanner(System.in);
					System.out.println("Quantos alunos há na sala de aula?");
					int resp=input.nextInt();
					int x=0;
					double soma=0;
					
					while(x < resp) {
						System.out.println("Digite a nota dos alunos :");
						double resp2=input.nextDouble();
						soma=soma+resp2;
						x++;
					}
					double media= soma /resp;
					 String mediaAprovados=(media>= 7 ? "Aprovados": "Reprovados");
					 System.out.printf("a media da turma foi %.2f"+ " e a turma foi %s",  media,mediaAprovados);
					
				}
}
