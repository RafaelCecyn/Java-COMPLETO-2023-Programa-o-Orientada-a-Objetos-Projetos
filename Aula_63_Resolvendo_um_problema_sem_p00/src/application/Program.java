package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Triangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangle x , y; // meus objetos x e y
		x = new Triangle(); // Instanciando meu objeto x
		y = new Triangle(); // Instanciando meu objeto y
		
		System.out.println("Enter the measuares of triangle X: ");
		x.a= sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Enter the measuares of triangle Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		double areaX = x.area();
		System.out.printf("Triangle X area: %.4f%n", areaX);
		
		double areaY = y.area();
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.printf("Larger area: X");
		} else {
			System.out.printf("Larger area: Y");
		}
		
		
		
		
		sc.close();

	}

}
