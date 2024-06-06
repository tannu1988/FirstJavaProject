package bankOperation;

public class BankOperation {

	private double balance;

	public BankOperation(double balance) {
		super();
		this.balance = balance;
	}

	public double deposite(double amount) {
		return balance = balance + amount;
	}

	public double withdraw(double amount) {
		if (balance >= amount) {
			return balance = balance - amount;
		}else {
			System.out.println("amount should be less than balance");
		}
		return balance;
	}

	public void viewBalance() {
		System.out.println("after deposite balance is: " + balance);
	}



}
