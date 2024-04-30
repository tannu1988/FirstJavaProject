package learnEncapsulation;

import java.util.Scanner;

public class MainAccountDetails {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
			//	int pinEntered= sc.nextInt();
		//		System.out.println("the entered pin is:"+pinEntered);
				AccountDetails swaroopAcct = new AccountDetails("456789123", 7890, 1234.56);
				
				System.out.println("Account Number: "+swaroopAcct.getAccountNumber(7890));
				swaroopAcct.setPinNumber(1234);
				swaroopAcct.setBalance(12000,1234);
				
				System.out.println("New Balance :"+swaroopAcct.getBalance());
				
			}

		
	}

