package bankOperation;

public class PersonsAccDetails {
	private String accountNumber;
	private String nameOfAccountHolder;
	private double balance;
	private int pin;
	private String onlineBankingPassword;

	public PersonsAccDetails(String accountNumber, String nameOfAccountHolder, double balance, int pin,
			String onlineBankingPassword) {
		super();
		this.accountNumber = accountNumber;
		this.nameOfAccountHolder = nameOfAccountHolder;
		this.balance = balance;
		this.pin = pin;
		this.onlineBankingPassword = onlineBankingPassword;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getNameOfAccountHolder() {
		return nameOfAccountHolder;
	}

	public void setNameOfAccountHolder(String nameOfAccountHolder) {
		this.nameOfAccountHolder = nameOfAccountHolder;
	}

	public String getOnlineBankingPassword() {
		return onlineBankingPassword;
	}

	public void setOnlineBankingPassword(String onlineBankingPassword, String enteredOBP) {
		if (validateOBP(enteredOBP)) {

			this.onlineBankingPassword = onlineBankingPassword;
		} else {
			System.out.println("Password is not correct");
		}
	}

	public boolean validateOBP(String enteredOBP) {
		if (this.onlineBankingPassword.equals(enteredOBP)) {
			System.out.println("you can deposite or withdraw money");
			return true;
		}
		System.out.println("Entered Online banking password is incorrect");
		return false;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public void setPin(int pin, int pinEntered) {
		if (validatePin(pinEntered)) {
			this.pin = pin;
		} else {
			System.out.println("Pin is not correct");
		}
	}

	public boolean validatePin(int pinEntered) {
		if (this.pin == pinEntered) {
			System.out.println("you can deposite or withdraw money");
			// this.balance = balance;
			return true;
		}
		System.out.println("Pin is incorrect");
		return false;
	}
}
