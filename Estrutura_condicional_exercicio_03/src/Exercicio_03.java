
/*
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
ordem crescente ou decrescente. 
 * */

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A,B;
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if (A > B) {
			if(A % B == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		} 
		else {
			if(B % A == 0) {
				System.out.println("Sao Multiplos");
			} else {
				System.out.println("Nao sao Multiplos");
			}
		}
		sc.close();
		
	}

}
