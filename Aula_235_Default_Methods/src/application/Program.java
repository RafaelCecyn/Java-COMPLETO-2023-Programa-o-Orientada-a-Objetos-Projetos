package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantia: ");
		double quantia = sc.nextDouble();
		
		System.out.print("Meses: ");
		int meses = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(quantia, meses);
		
		System.out.println("Pagamento apos " + meses + " meses: ");
		System.out.printf("%.2f",payment);
		
		
		sc.close();

	}

}
