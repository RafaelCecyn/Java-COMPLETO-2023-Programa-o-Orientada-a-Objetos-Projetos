/*
 	Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. 
 	Depois, mostrar na tela a altura média das pessoas, e mostrar também a porcentagem de 
 	pessoas com menos de 16 anos, bem como os nomes dessas pessoas caso houver.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();
		
		// Criação dos vetores
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		double[] vetAltura = new double[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			vetNome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			vetAltura[i] = sc.nextDouble();
		}
		
		double somaAltura = 0.0;
		double menor16 = 0.0;
		
		for(int i = 0; i < n; i ++) {
			somaAltura += vetAltura[i];
			
			if (vetIdade[i] < 16)  {
				menor16++;
			}
			
		}
		
		double avg = somaAltura / n;
		
		double porcentagemMenor16 = menor16 / n * 100;
		
		System.out.printf("Altura média: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", porcentagemMenor16); 
		// colocar os dois %% para aparecer um %
		
		for(int i = 0; i < n; i++) {
			if(vetIdade[i] < 16) {
				System.out.println(vetNome[i]);
			}
		}
		sc.close();
		
		

	}

}
