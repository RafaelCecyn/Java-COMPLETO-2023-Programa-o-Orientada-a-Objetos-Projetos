import java.util.Locale;
import java.util.Scanner;


public class Entrada_de_dados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//double x;
		//x = sc.nextDouble();
		//System.out.println("Você digitou: " + x); // Input 4,5 e Output 4.5 por causa do println
		//System.out.printf("Você digitou: %.2f%n", x); // Input 4,5 e Output 4,5 por causa do printf
		
		String x;
		int y;
		double z;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		System.out.println("Dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		sc.close();
	}

}
