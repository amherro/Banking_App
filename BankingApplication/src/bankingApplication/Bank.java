package bankingApplication;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Regional Bank of America!");
		System.out.println("Please enter your username followed by your account number to sign in");
		User user = new User(sc.next(), sc.next());
		user.startBank();
	}
}
