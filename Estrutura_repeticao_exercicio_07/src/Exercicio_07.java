
/*
 Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
*/

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double divisao = (double) x / y;
				System.out.println(divisao);
			}
			
		}
		
		sc.close();

	}

}
