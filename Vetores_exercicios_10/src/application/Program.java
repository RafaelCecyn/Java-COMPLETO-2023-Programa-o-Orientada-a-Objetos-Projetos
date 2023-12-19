/*
 	Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
	no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. 
	Depois, imprimiros nomes dos alunos aprovados, considerando aprovados aqueles cuja média
	das notas seja maior ou igual a 6.0 (seis).
 */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		// Criação dos vetores
		String[] vetNome = new String[n];
		double[] vetNota1 = new double[n];
		double[] vetNota2 = new double[n];
		double[] vetSomaNotas = new double[n];
		double[] vetMediaNotas = new double[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("Digite nome, primeira e segunda nota do %d aluno: %n", i+1);
			sc.nextLine();
			vetNome[i] = sc.nextLine();
			vetNota1[i] = sc.nextDouble();
			vetNota2[i] = sc.nextDouble();
		}
		
		for(int i = 0; i < n; i ++) {
			vetSomaNotas[i] = vetNota1[i] + vetNota2[i];
			vetMediaNotas[i] = vetSomaNotas[i] / 2;
		}
		
		System.out.println("Alunos aprovados: ");
		
		for(int i = 0; i < n; i ++) {
			if(vetMediaNotas[i] >= 6.0) {
				System.out.println(vetNome[i]);
			}
		}
		
		sc.close();
		
	}

}
