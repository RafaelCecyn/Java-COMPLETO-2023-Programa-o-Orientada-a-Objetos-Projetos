
/*
Lembre que, se o salário for R$ 3002.00, a taxa que incide é de 8% apenas sobre R$ 1000.00, pois a faixa de
salário que fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. No exemplo fornecido (abaixo), a taxa é
de 8% sobre R$ 1000.00 + 18% sobre R$ 2.00, o que resulta em R$ 80.36 no total. O valor deve ser impresso com
duas casas decimais.
  */

import java.util.Scanner;
import java.util.Locale;

public class Exercicio_08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double salario,imposto;
		
		salario = sc.nextDouble();
		
		if (salario <= 2000.00) {
			imposto = 0.0;
		}
		else if (salario <= 3000.0) {
			imposto = (salario - 2000) * 0.08;
			
		}
		else if (salario <= 4500.00) {
			imposto = (1000 * 0.08) + (salario - 3000) * 0.18; 
		}
		else {
			imposto = (1000 * 0.08) + (1500 * 0.18) + (salario - 4500) * 0.28; 
		}
		
		if(imposto == 0.0) {
			System.out.println("Isento");
		} 
		else {
			System.out.printf("R$ %.2f",imposto);
		}
		
		sc.close();
			

	}

}
