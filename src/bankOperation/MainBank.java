package bankOperation;

import java.util.Scanner;

public class MainBank {

	public static void main(String[] args) {

		BankOperation atm1 = new ATM(30000);
		BankOperation onlineBanking = new OnlineBanking(30000);
		//ATM atm = new ATM();
		PersonsAccDetails personAccDetail = new PersonsAccDetails("98792334567", "Taranpreet", 30000, 1234,"dfsdfsdfsdfds");

		double balance = personAccDetail.getBalance();
		System.out.println("The balance is :" + balance);
		Scanner sc = new Scanner(System.in);
				System.out.println("Type of banking service the user want, ATM or OnlineBanking");
		String bankServices = sc.next();

		switch (bankServices) {
		case "ATM":
			System.out.println("do you want to deposite cash through ATM?yes or not: ");
			String depositeCash = sc.next();
			if (depositeCash.equals("yes")) {
				System.out.println("Enter a pin for deposite amount: ");
				int enteredPin = sc.nextInt();
				if (personAccDetail.validatePin(enteredPin)) {
					System.out.println("Enter amount for deposite: ");
					double amount = sc.nextDouble();
					personAccDetail.setBalance(personAccDetail.getBalance() + atm1.deposite(amount));
					System.out.println(personAccDetail.getBalance());

				}

			}
			break;
		case "OnlineBanking":
			System.out.println("do you want to withdraw cash through online banking?yes or not: ");
			String withdrawCash = sc.next();
			if (withdrawCash.equals("yes")) {
				System.out.println("Enter a online banking password for withdraw amount: ");
				String enteredOBP = sc.next();
				if (personAccDetail.validateOBP(enteredOBP)) {
					System.out.println("Enter amount for withdraw: ");
					double amount = sc.nextDouble();
					//personAccDetail.getBalance(personAccDetail.getBalance()-onlineBanking.withdraw(amount));
					             
					System.out.println(onlineBanking.withdraw(amount));
				}

			}
			break;
		default:
			System.out.println("Operation did not match");
			break;
		}

	}

}
