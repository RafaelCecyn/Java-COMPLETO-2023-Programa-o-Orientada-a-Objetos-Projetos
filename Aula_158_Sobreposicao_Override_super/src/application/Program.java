package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1002,"Alex", 1000.00);
		acc.withDraw(200.0);
		System.out.println(acc.getBalance()); // 800
		
		Account acc2 = new SavingsAccount(1003, "Anna", 1000.00, 0.1);
		acc2.withDraw(200.00);
		System.out.println(acc2.getBalance()); // 795
		
		Account acc3 = new BusinessAccount(1004, "Bob", 1000.00, 500.00);
		acc3.withDraw(200.00);
		System.out.println(acc3.getBalance()); // 793

	}

}
