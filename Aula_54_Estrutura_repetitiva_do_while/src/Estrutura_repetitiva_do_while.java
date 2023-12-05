
import java.util.Scanner;
import java.util.Locale;

public class Estrutura_repetitiva_do_while {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		
		
		do {
			System.out.print("Digite a temperatura em Celsius: ");
			double tempCelsius = sc.nextDouble();
			double tempFahr = (9 * tempCelsius / 5) + 32;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n",tempFahr);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
			
		sc.close();

	}

}
