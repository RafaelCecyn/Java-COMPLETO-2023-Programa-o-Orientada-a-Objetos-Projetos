
/*
 Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 Calcule e mostre o valor a ser pago.
 */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int codigoPeca1,numeroPeca1,codigoPeca2,numeroPeca2;
		double valorUnitario1,valorUnitario2,valorPago;
		
		codigoPeca1 = sc.nextInt();
		numeroPeca1 = sc.nextInt();
		valorUnitario1 = sc.nextDouble();
		codigoPeca2 = sc.nextInt();
		numeroPeca2 = sc.nextInt();
		valorUnitario2 = sc.nextDouble();
		
		valorPago = (numeroPeca1 * valorUnitario1 + numeroPeca2 * valorUnitario2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f",valorPago);

	}

}
