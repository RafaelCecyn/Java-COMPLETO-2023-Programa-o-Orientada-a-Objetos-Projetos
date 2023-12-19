/*
	Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
	que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
	de homens.
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
		double maiorAltura = -9999.99;
		double menorAltura = 9999.99;
		
		
		// Criação dos vetores
		double[] vetAltura = new double[n];
		char[] vetGenero = new char[n];
		
		for(int i = 0; i < n; i ++) {
			System.out.printf("Altura da %da pessoa: ", i+1);
			vetAltura[i] = sc.nextDouble();
			sc.nextLine();
			System.out.printf("Genero da %da pessoa: ", i+1);
			vetGenero[i] = sc.next().charAt(0);
		}
		
		double sumAlturas = 0.0;
		int qtdeHomens = 0;
		int qtdeMulheres = 0;
		
		for(int i = 0; i < n; i ++) {
			if(vetAltura[i] > maiorAltura) {
				maiorAltura = vetAltura[i];
			}
			if(vetAltura[i] < menorAltura) {
				menorAltura = vetAltura[i];
			}
			
			if(vetGenero[i] == 'M') {
				qtdeHomens++;
			}
			
			if(vetGenero[i] == 'F' ) {				
				sumAlturas += vetAltura[i];
				qtdeMulheres++;
			}
		}
		
		double avgAlturas = sumAlturas / qtdeMulheres; // casting
		
		System.out.printf("Menor altura = %.2f%n",menorAltura);
		System.out.printf("Maior altura = %.2f%n",maiorAltura);
		System.out.printf("Media das alturas das mulheres = %.2f%n",avgAlturas);
		System.out.printf("Numero de homens = %d",qtdeHomens);
		
		
		
		
		
		sc.close();

	}

}
