package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));
		
		//Predicate<Product> pred = p -> p.getPrice() >= 100;
		
		//list.removeIf(new ProductPredicate()); // Implementando a interface Predicate na Classe
		//list.removeIf(Product::staticProductPredicate); // Method Reference estático
		//list.removeIf(Product::nonStaticProductPredicate); // Method Reference não estático
		//list.removeIf(pred); // Expressão Lambda declarada
		list.removeIf(p -> p.getPrice() >= 100);  // Expressão Lambda inline
		
		for(Product p: list) {
			System.out.println(p);
		}

	}

}
