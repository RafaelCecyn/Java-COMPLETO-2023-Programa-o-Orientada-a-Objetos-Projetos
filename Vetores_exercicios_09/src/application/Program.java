/*
 	Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
	devem ser armazenados em um vetor, e as idades em um outro vetor. 
	Depois, mostrar na tela o nome da pessoa mais velha.
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		int n = sc.nextInt();
		int maisVelho = 0;
		String pessoaMaisVelha = "";
		
		String[] vetNome = new String[n];
		int[] vetIdade = new int[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("Dados da %da pessoa: %n", i+1);
			sc.nextLine();
			System.out.print("Nome: ");
			vetNome[i] = sc.nextLine();
			
			System.out.print("Idade: ");
			vetIdade[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n; i ++) {
			if(vetIdade[i] > maisVelho) {
				maisVelho = vetIdade[i]; 
				pessoaMaisVelha = vetNome[i];
			}
		}
		
		System.out.printf("PESSOA MAIS VELHA: %s", pessoaMaisVelha);
		
		sc.close();
		

	}

}
