
/*
 Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 mensagem explicativa, conforme exemplos.
  */

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		int A,B,SOMA;
		
		Scanner sc = new Scanner(System.in);
		A = sc.nextInt();
		B = sc.nextInt();
		SOMA = A + B;
		System.out.println("SOMA = " + SOMA);

		sc.close();
	}

}
