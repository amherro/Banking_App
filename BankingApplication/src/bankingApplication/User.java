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
		System.out.println("Welcome " + name + "!");
		System.out.println("Please select an option from the menu and press Enter. To exit the system, please press 6.");
		
		// Bank Menu
		System.out.println("MAIN MENU: ");
		System.out.println("1.) View account information");
		System.out.println("2.) Check account balance");
		System.out.println("3.) Make a deposit");
		System.out.println("4.) Withdraw from account");
		System.out.println("5.) View previous transaction");
		System.out.println("6.) EXIT");
		
		// Put switch statement here and use scanner to get user input.
		switch(scanner.nextInt()) {
		case 1: 
			this.getAccountInfo();
			break;
		}
	}
}
