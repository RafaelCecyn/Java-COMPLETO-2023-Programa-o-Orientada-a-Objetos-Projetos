package application;

import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>(); 
		
		// Posso colocar Integer ou String sem problemas, ou qualquer outro tipo
		
		System.out.print("How many values? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
