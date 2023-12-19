package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Client;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Client cliente;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nomeConta = sc.nextLine();
		System.out.print("Is there a initial deposit (y/n)? ");
		char resp = sc.next().charAt(0);
		if (resp == 'y') {
			System.out.print("Enter initial deposit value: ");
			double valorInicial = sc.nextDouble();
			cliente = new Client(numeroConta, nomeConta, valorInicial);
		} else {
			cliente = new Client(numeroConta, nomeConta);
		}
		
		System.out.println();
		
		System.out.println("Account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", cliente.getNumeroConta(),cliente.getNomeTitular(),cliente.getValorInicial());
		
		System.out.println();
		
		System.out.print("Enter a deposit value: ");
		double valorDepositado = sc.nextDouble();
		cliente.deposito(valorDepositado);
		
		System.out.println("Account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", cliente.getNumeroConta(),cliente.getNomeTitular(),cliente.getValorInicial());
		
		System.out.println();
		
		System.out.print("Enter a withdraw value: ");
		double valorSacado = sc.nextDouble();
		cliente.saque(valorSacado);
		
		System.out.println("Account data: ");
		System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", cliente.getNumeroConta(),cliente.getNomeTitular(),cliente.getValorInicial());
		
		
		sc.close();

	}

}
