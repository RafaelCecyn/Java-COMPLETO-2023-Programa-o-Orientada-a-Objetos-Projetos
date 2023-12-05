
/*
	Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de 
	N = N * (N-1) * (N-2) * (N-3) * ... * 1.
	Lembrando que, por definição, fatorial de 0 é 1.
*/

import java.util.Scanner;

public class Exercicio_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int mult = 1;
		
		for(int i = 1; i <= N; i++) {
			mult *= i;
		}
		System.out.println(mult);
		sc.close();
	}

}
