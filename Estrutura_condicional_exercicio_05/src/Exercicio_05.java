
/*
 Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
 seguir, calcule e mostre o valor da conta a pagar.
  */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigo,quantidade;
		double preco;
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		if(codigo == 1) {
			preco = quantidade * 4.00;
			System.out.printf("Total: R$ %.2f", preco);
		}
		else if(codigo == 2) {
			preco = quantidade * 4.50;
			System.out.printf("Total: R$ %.2f", preco);
		}
		else if(codigo == 3) {
			preco = quantidade * 5.00;
			System.out.printf("Total: R$ %.2f", preco);
		}
		else if(codigo == 4) {
			preco = quantidade * 2.00;
			System.out.printf("Total: R$ %.2f", preco);
		}
		else if(codigo == 5) {
			preco = quantidade * 1.50;
			System.out.printf("Total: R$ %.2f", preco);
		}
		
		sc.close();

	}

}
