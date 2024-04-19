package loop;

import java.util.Scanner;

public class LogInApplication {

	String userId = "PivotAdmin";
	String password = "Admin123";
	Scanner sc = new Scanner(System.in);
	public void logInOrNot() {
		for(int i=1; i<=3; i++) {
			System.out.println("Enter the user name");
			String userName = sc.next();
			System.out.println("Enter the user password");
			String userPassword = sc.next();
			
			if (userName.equals(userId) && userPassword.equals(password)) {
				System.out.println("You are logged in to the application");
				break;
			} else {System.out.println("Incorrect username and password. Try Again.");
		}
		

	
}
}}