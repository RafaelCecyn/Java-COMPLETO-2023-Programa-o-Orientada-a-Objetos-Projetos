/*
 	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
	o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
	considerando a primeira posição como 0 (zero).
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double maior = 0.0;
		int posicaoMaior = 0;
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] > maior) {
				maior = vet[i];
				posicaoMaior = i;
			}
		}
		
		System.out.printf("MAIOR VALOR = %.1f%n",maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + posicaoMaior);
		
		sc.close();
	}

}
