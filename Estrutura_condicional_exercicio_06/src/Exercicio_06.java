
/*
 Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
 seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. 
 Obviamente se o valor não estiver emnenhum destes intervalos, deverá ser impressa
  a mensagem “Fora de intervalo”.
  */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
		x = sc.nextDouble();

		if (x < 0 || x > 100.00) {
			System.out.println("Fora de intervalo");
		}
		else if (x <= 25.00) {
			System.out.println("Intervalo [0,25]");
		}
		else if (x <= 50.00) {
			System.out.println("Intervalo [25,50]");
		}
		else if (x <= 75.00) {
			System.out.println("Intervalo [50,75]");
		}
		else {
			System.out.println("Intervalo [75,100]");
		}
		sc.close();
	}

}
