/*
  	Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
 	Imprimir todos os elementos do vetor
 	Mostrar na tela a soma e a média dos elementos do vetor
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
		double[] vet = new double[n];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		System.out.print("VALORES = ");
		for(int i = 0; i < vet.length; i++) {
			System.out.printf("%.2f ",vet[i]);
			sum += vet[i];
		}
		
		System.out.println();
		
		System.out.printf("SOMA = %.2f%n",sum);
		
		double avg = sum / n;
		
		System.out.printf("MEDIA = %.2f%n",avg);
		
		sc.close();

	}

}
