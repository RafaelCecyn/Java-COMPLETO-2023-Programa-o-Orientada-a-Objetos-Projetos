package application;

public class Program {

	public static void main(String[] args) {
		int x = 20;
		
		Object obj = x; // Boxing
		
		System.out.println(obj);
		
		int y = (int) obj; // Unboxing
		
		System.out.println(y);
		
		// Usando Wrapper Classes não preciso fazer casting
		
		int a = 10;
		
		Integer obj2 = a; // Aqui o Integer e Wrapper Classes
		
		int b = obj2; // Não preciso de Casting
		
		System.out.println(obj2);
		System.out.println(b);
		
		

	}

}
