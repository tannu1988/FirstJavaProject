package bankOperation;

public class ATM extends BankOperation {

	

	public ATM(double balance) {
		super(balance);
	}

	public double deposite(double amount, double balance) {
		return balance= balance + amount;
	}

	public void viewBalance(double balance) {
		System.out.println("after deposite balance is: " + balance);
	}
}
