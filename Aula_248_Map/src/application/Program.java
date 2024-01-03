package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
		
		Map<String,String> cookies = new TreeMap<>();
		
		cookies.put("username", "Maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "99771122");
		
		cookies.remove("email"); // remove a chave e-mail
		cookies.put("phone", "99771133"); // substitui o chave de cima, pois não admite repetição na chave
		
		System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // true
		System.out.println("Phone number: " + cookies.get("phone")); // 99771133
		System.out.println("Email: " + cookies.get("email")); // retorna null pq foi excluído
		System.out.println("Size: " + cookies.size()); // 2
		
		
		System.out.println("ALL COOKIES: ");
		for(String key : cookies.keySet()) {
			System.out.println(key + ": " + cookies.get(key));
		}

	}

}
