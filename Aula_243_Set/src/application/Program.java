package application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		System.out.println(set.contains("Notebook"));

		for (String p : set) {
			System.out.println(p);
		}
		/*
		 * Tv Notebook Tablet -> Ordem não respeitada
		 */

		Set<String> set2 = new TreeSet<>();

		set2.add("Tv");
		set2.add("Tablet");
		set2.add("Notebook");

		for (String p : set2) {
			System.out.println(p);
		}

		/*
		 * Notebook Tablet Tv -> Ordena por String
		 */

		Set<String> set3 = new LinkedHashSet<>();

		set3.add("Tv");
		set3.add("Tablet");
		set3.add("Notebook");

		for (String p : set3) {
			System.out.println(p);
		}

		/*
		 * Tv Tablet Notebook -> Respeita a ordem de entrada
		 */

		Set<String> set4 = new LinkedHashSet<>();

		set4.add("Tv");
		set4.add("Tablet");
		set4.add("Notebook");

		set4.removeIf(x -> x.length() >= 3);

		for (String p : set4) {
			System.out.println(p);
		}

		// TV

		// OPERAÇÕES DE CONJUNTO

		Set<Integer> a = new TreeSet<>(Arrays.asList(0, 2, 4, 5, 6, 8, 10));
		Set<Integer> b = new TreeSet<>(Arrays.asList(5, 6, 7, 8, 9, 10));
		// union
		Set<Integer> c = new TreeSet<>(a); // Construtor especial com outra coleção como argumento c copia do conjunto a
		c.addAll(b);
		System.out.println(c);
		// intersection
		Set<Integer> d = new TreeSet<>(a);
		d.retainAll(b);
		System.out.println(d);
		// difference
		Set<Integer> e = new TreeSet<>(a);
		e.removeAll(b);
		System.out.println(e);

	}

}
