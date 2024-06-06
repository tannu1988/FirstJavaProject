package bankOperation;

public class OnlineBanking extends BankOperation {

	public OnlineBanking(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount, double balance) {
		if (balance >= amount) {
			balance = balance - amount;
		} else {
			System.out.println("amount should be less than balance");
		}
	}

	public void viewBalance(double balance) {
		System.out.println("after deposite balance is: " + balance);
	}
}
