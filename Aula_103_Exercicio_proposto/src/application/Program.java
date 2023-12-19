/*
	Fazer um programa para ler dois números inteiros M e N, e depois ler
	uma matriz de M linhas por N colunas contendo números inteiros,
	podendo haver repetições. Em seguida, ler um número inteiro X que
	pertence à matriz. Para cada ocorrência de X, mostrar os valores à
	esquerda, acima, à direita e abaixo de X, quando houver, conforme
	exemplo.
*/

package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		int x = sc.nextInt();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.printf("Position %d,%d:%n",i,j);
					System.out.printf("Left: %d%n",mat[i][j-1]);
					if(i > 0) {
						System.out.printf("Up: %d%n",mat[i-1][j]);						
					}
					if (j < 3) {
						System.out.printf("Right: %d%n",mat[i][j+1]);						
					}
					System.out.printf("Down: %d%n",mat[i+1][j]);
				}
			}
		}
		
		sc.close();
		
		
	}

}
