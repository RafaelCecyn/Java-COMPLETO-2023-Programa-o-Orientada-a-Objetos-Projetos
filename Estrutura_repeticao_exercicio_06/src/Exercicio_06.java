
/*
 Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir.
 Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. 
 Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor
 tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.
*/

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			double n1 = sc.nextDouble();
			double n2 = sc.nextDouble();
			double n3 = sc.nextDouble();
			
			double media = (n1 * 2 + n2 * 3 + n3 * 5) / 10;
			
			System.out.printf("%.1f%n",media);
		}
		
		
		
		sc.close();

	}

}
