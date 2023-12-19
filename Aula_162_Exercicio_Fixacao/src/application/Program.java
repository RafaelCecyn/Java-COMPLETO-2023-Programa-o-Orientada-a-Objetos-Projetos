package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UserProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Enter the number of products:");
		int n = sc.nextInt();
		
		List<Product> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char resp = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (resp == 'i') {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				Product product = new ImportedProduct(name, price, customFee); // UpCasting
				list.add(product);
			}
			else if (resp == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manufactureDate = sdf.parse(sc.next());
				Product product = new UserProduct(name, price, manufactureDate); // UpCasting
				list.add(product);
			}
			else {
				Product product = new Product(name, price); 
				list.add(product);
			}
		}
		
		System.out.println("PRICE TAGS:");
		for (Product product: list) {
			System.out.println(product.priceTag());
		}
		
		sc.close();

	}

}
