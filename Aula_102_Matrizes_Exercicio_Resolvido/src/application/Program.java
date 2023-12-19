package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n]; // Declaracao de matriz
		int countNegative = 0;
		
		for(int i = 0; i < mat.length; i++) {// ver length depois
			for(int j = 0; j < mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		
		for(int i = 0; i < mat.length; i++) {// ver length depois
			System.out.printf("%d ",mat[i][i]);
		}
		
		System.out.println();
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[i].length; j++) {
				if(mat[i][j] < 0) {
					countNegative++;
				}
			}
		}
		
		System.out.printf("Negative numbers = %d",countNegative);
		sc.close();

	}

}
