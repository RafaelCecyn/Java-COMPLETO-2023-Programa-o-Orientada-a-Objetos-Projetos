/*
 	Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
	aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
	digitado, mostrar a mensagem "NENHUM NUMERO PAR"
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		int[] vet = new int[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		int sumPar = 0;
		int qtdePares = 0;
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] % 2 == 0) {
				sumPar += vet[i];
				qtdePares++;
			}
		}
		
		double avg = (double)sumPar / qtdePares; // casting
		
		if(qtdePares != 0) {
			System.out.printf("MEDIA DOS PARES = %.1f", avg);
		} else {
			System.out.println("NENHUM NUMERO PAR");
		}
		
		sc.close();

	}

}
