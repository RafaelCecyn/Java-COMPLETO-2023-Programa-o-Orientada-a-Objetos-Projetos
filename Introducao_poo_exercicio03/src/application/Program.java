package application;

import java.util.Scanner;
import java.util.Locale;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		
		stu.name = sc.nextLine();
		stu.grade1 = sc.nextDouble();
		stu.grade2 = sc.nextDouble();
		stu.grade3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n",stu.finalGrade());
		System.out.println(stu.isPassed());
		System.out.printf(stu.missing());

		sc.close();
	}

}
