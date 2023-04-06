package aula19_Arrays;

import java.util.Scanner;

public class Exercicio22 {

	public static void main(String[] args) {
		/*Criar um vetorA com 10 elementos inteiros. Desenvolver um
		programa que verifique se "todos" os elementos do vetor A
		são pares. 
		
		Se pelo menos um elemento do vetor não for
		par, o processo de repetição para de percorrer os elementos
		do vetor e deve ser encerrado*/
		
		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[4];
		
		
		for(int x=0; x< vetorA.length;x++) {
			System.out.println("Entre com um numero para a posicao: "+(x+1));
			vetorA[x] = ler.nextInt();
			
			if(vetorA[x] % 2 !=0) {
				break;//para parar o laço
			}
		}
	}
}
