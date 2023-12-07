package entities;

public class Dolar {
	
	public static double IOF = 0.06;
	
	public static double CurrencyConverter(double price, double amount) {
		return price * amount * (1 + IOF);
	}

}
