package loop;

import java.util.Scanner;

public class AmusementParkRide {
	int allowedPeople = 10;
	Scanner sc = new Scanner(System.in);

	void overfillingTheRide() {

		for (int i = 1; i <= allowedPeople; i++) {
			System.out.println("Enter the person height");
			int height = sc.nextInt();
			if (height > 90 && height < 200) {
				System.out.println("you can take a ride");
			} else {
				System.out.println("You cant take a ride");
			}
		}
		{
			System.out.println("maximum 10 people allow");
		}
	}
}