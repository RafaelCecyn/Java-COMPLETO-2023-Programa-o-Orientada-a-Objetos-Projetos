package entities;

public class Product {
	public String name;
	public double price;
	public int quantity;
	
	// Construtor padrão
	public Product() {
		}
	
	// Meu construtor com seus parâmetros
	public Product(String name, double price, int quantity) { // não precisa ser os mesmos nomes do atributo
		this.name = name; // this -> atributo do objeto, 2 name -> parâmentro do método7
		this.price = price;
		this.quantity = quantity;
	}
	
	// Sobrecarga
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());
	}
}

