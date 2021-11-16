package bankingApplication;

import java.util.Scanner;

public class User {
	private String name; 
	private String accountNumber;
	private double balance = 0;
	
	Scanner scanner = new Scanner(System.in);
	
	User(String name, String accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}
	
	public void getAccountInfo() {
		System.out.println("Account Name: " + name);
		System.out.println("Account Number: " + accountNumber);
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double depositMoney(double deposit) {
		return balance += deposit;
	}
	
	public double withdrawMoney(double amountToWithdraw) {
		return balance -= amountToWithdraw;
	}
	
	public void startBank() {
		System.out.println("Welcome to Regional Bank of America " + name + "!");
		System.out.println("Please select an option from the menu. To exit the system, please press 6.");
		
		// Put switch statement here and use scanner to get user input.
	}
}
