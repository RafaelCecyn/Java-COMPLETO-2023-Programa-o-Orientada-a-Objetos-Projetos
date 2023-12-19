package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2,"Marco");
		
		System.out.println(list.size());
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		// remove com base na posição da lista
		//list.remove(0); 
		
		// remove com base no nome
		//list.remove("Maria"); 
		
		// remove com base na condição
		list.removeIf(x -> x.charAt(0) == 'M');
		
		for(String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		System.out.println("Index of Bob :" + list.indexOf("Bob")); // 1
		System.out.println("Index of Marco :" + list.indexOf("Marco")); // -1
		System.out.println("-----------------------------");
		// Predicado
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		
		for(String x: result) {
			System.out.println(x); // Alex e Anna
		}
		
		System.out.println("-----------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		

	}

}
