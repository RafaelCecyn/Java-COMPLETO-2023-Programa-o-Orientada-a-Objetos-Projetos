package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			 List<Employee> list = new ArrayList<>();
			 
			 String line = br.readLine();
			 
			 while(line != null) {
				 String[] fields = line.split(",");
				 list.add(new Employee(fields[0], (fields[1]),Double.parseDouble(fields[2])));
				 line = br.readLine();				 
			 }
			 
			 List<String> email = list.stream().filter(p -> p.getSalary() > salary)
					 .map(p -> p.getEmail())
					 .collect(Collectors.toList());
			 
			 email.forEach(System.out::println);
			 
			 System.out.print("Sum of salary of people whose name starts with 'M': ");
			 double sum = list.stream().filter(p -> p.getName().charAt(0) == 'M')
					 .map(p -> p.getSalary())
					 .reduce(0.0, (x,y) -> x + y);
			 System.out.println(sum);
			 
			 
		}
		
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		
		sc.close();

	}

}
