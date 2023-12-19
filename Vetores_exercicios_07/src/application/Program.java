/*
 	Fazer um programa para ler um número inteiro N e depois um vetor de N números reais. Em seguida,
	mostrar na tela a média aritmética de todos elementos com três casas decimais. 
	Depois mostrar todos os elementos do vetor que estejam abaixo da média, 
	com uma casa decimal cada.
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
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		
		double sum = 0.0;
		
		for(int i = 0; i < vet.length; i++) {
			sum += vet[i];
		}
		
		double avg = sum / n;
		
		System.out.printf("MEDIA DO VETOR = %.3f%n", avg);
		
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] < avg) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
