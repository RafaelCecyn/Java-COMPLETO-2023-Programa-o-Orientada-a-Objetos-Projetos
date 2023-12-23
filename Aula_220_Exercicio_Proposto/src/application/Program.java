package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product> list = new ArrayList<>();

		String path = "/home/rafael/Desktop/Curso_Java_Udemy/Secao_17/summary.csv";
		String newPath = "/home/rafael/Desktop/Curso_Java_Udemy/Secao_17/summary2.csv";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				
				String[] vet = line.split(",");
				String name = vet[0];
				double price = Float.parseFloat(vet[1]);
				int quantity = Integer.parseInt(vet[2]);
				
				list.add(new Product(name, price, quantity));
				
				line = br.readLine();
			}
			
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(newPath))) {
				
				for(Product item:list) {
					bw.write(item.getName() + "," + String.format("%.2f",item.total()));
					bw.newLine();
				}
				
				System.out.println("Created");
				
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
