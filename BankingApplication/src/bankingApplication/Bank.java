package bankingApplication;


public class Bank {
	public static void main(String[] args) {
		User adam = new User("Adam", "A000001");
		adam.startBank();
		adam.getAccountInfo();
		
	}
}
