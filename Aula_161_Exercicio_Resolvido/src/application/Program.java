package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		// Lista do tipo Employee -> Mais genérico
		List<Employee> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i + " data");
			System.out.print("Outsourced (y/n)?");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Hours:");
			int hours = sc.nextInt();
			System.out.print("Value per hour:");
			double valuePerHour = sc.nextDouble();
			if (resp == 'y') {
				System.out.print("Additional charge:");
				double additionalCharge = sc.nextDouble();
				OutsourcedEmployee outEmp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				// Resolução do professor
				// Employee outEmp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
				list.add(outEmp);
			}
			else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
		}
		
		System.out.println("PAYMENTS:");
		for(Employee x:list) {
			System.out.printf("%s - $ %.2f%n",x.getName(),x.payment());
		}
		
		sc.close();

	}

}
