package entities;

public class Client {
	
	public static final double Taxa = 5.00;
	
	private int numeroConta;
	private String nomeTitular;
	private double valorInicial;
	
	public Client(int numeroConta, String nomeTitular, double valorInicial) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		deposito(valorInicial);
	}
	
	public Client(int numeroConta, String nomeTitular) {
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	
	public double getValorInicial() {
		return valorInicial;
	}
	
	public void deposito(double valor) {
		this.valorInicial += valor;
	}
	
	public void saque(double valor) {
		this.valorInicial -=  (valor + Taxa);
	}

}
