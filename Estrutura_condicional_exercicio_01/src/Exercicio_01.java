
/*
 Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não. 
 */

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		x = sc.nextInt();
		
		if (x > 0) {
			System.out.println("NAO NEGATIVO");
		}
		else {
			System.out.println("NEGATIVO");
		}
		sc.close();

	}

}
