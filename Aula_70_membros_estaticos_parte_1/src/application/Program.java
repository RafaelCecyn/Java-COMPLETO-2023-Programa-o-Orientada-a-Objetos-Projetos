/* _>>>>>>> Primeira versão
package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	
	public static final double PI = 3.14159; // final para dizer que é constante

	public static void main(String[] args) { // main só pode chamar métodos estáticos
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double raio = sc.nextDouble();
		double c = circumference(raio);
		System.out.printf("Circumference: %.2f%n", c);
		double v = volume(raio);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", PI);
		
		sc.close();
		
	}
	
	public static double circumference(double radius) {
		return 2 * PI * radius;
	}
	
	public static double volume(double radius) {
		return 4 * PI * radius * radius * radius / 3;
	}

}
*/

/* >>>>>>> Segunda versão
 package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Calculator calc = new Calculator();
		
		
		System.out.print("Enter radius: ");
		double raio = sc.nextDouble();
		
		double c = calc.circumference(raio);
		
		System.out.printf("Circumference: %.2f%n", c);
		
		double v = calc.volume(raio);
		
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", calc.PI);
		
		sc.close();
	}

}
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {
	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Enter radius: ");
		double raio = sc.nextDouble();
		
		double c = Calculator.circumference(raio);
		
		System.out.printf("Circumference: %.2f%n", c);
		
		double v = Calculator.volume(raio);
		
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}

}

