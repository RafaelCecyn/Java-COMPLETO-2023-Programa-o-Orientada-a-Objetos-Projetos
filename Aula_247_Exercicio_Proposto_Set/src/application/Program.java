package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> A = new HashSet<>();
		Set<Integer> B = new HashSet<>();
		Set<Integer> C = new HashSet<>();

		System.out.print("How many students for course A? ");
		int na = sc.nextInt();
		
		for(int i = 0; i < na; i++) {
			int numeroA = sc.nextInt();
			A.add(numeroA);
		}
		
		System.out.print("How many students for course B? ");
		int nb = sc.nextInt();
		
		for(int i = 0; i < nb; i++) {
			int numeroB = sc.nextInt();
			B.add(numeroB);
		}
		
		System.out.print("How many students for course C? ");
		int nc = sc.nextInt();
		
		for(int i = 0; i < nc; i++) {
			int numeroC = sc.nextInt();
			C.add(numeroC);
		}
		
		Set<Integer> total = new HashSet<>(A);
		total.addAll(B);
		total.addAll(C);

		System.out.println("Total students: " + total.size());

		sc.close();

	}

}
