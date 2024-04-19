package exampleOfSwitchCase;

import java.util.Scanner;

public class PizzaShop {
	String addExtraCheese;
	String addPepperoni;
	int price;
	double bill;
	Scanner sc = new Scanner(System.in);

	void OderAPizza() {
		System.out.println(
				"There are three sizes of cheese pizza :\t" + "[ Small Pizza || Medium Pizza || Large Pizza] :\n");
		System.out.println("\nFor additional pepperoni topping:\n "
				+ "Pepperoni for Small Pizza: +$2,  Pepperoni for Medium or Large Pizza: +$3\n"
				+ "Extra cheese for any size pizza: + $1\n");

		System.out.println("What size of pizza do you want?:\t");

		String cheesePizzaTypes = sc.next();
		switch (cheesePizzaTypes) {
		case "smallpizza":
			System.out.println("The price for small cheese pizza is:  $ " + (price = 15));
			System.out.println("do you want to add pepperoni? yes or not: ");
			String addPepperoni = sc.next();
			if (addPepperoni.equals("yes")) {
				System.out.println("After adding additional pepperoni,the price  is: $ " + (price = (price) + 2));
			}
			System.out.println("do you want extra cheese? yes or not: ");
			String addExtraCheese = sc.next();
			if (addExtraCheese.equals("yes")) {
				System.out.println("After adding extra cheese, the price is: $ " + (price = (price) + 1));
			}
			System.out.println("\n final bill is: $" + price);

			break;
		case "mediumpizza":
			System.out.println("The price for medium cheese pizza is:  $" + (price = 20));
			System.out.println("do you want to add pepperoni? yes or not: ");
			addPepperoni = sc.next();
			if (addPepperoni.equals("yes")) {
				System.out.println("After adding additional pepperoni,the price  is: $ " + (price = (price) + 3));
			}
			System.out.println("do you want extra cheese? yes or not: ");
			addExtraCheese = sc.next();
			if (addExtraCheese.equals("yes")) {
				System.out.println("After adding extra cheese, the price is: $ " + (price = (price) + 1));
			}

			System.out.println("\n final bill is:" + price);
			break;
		case "largepizza":
			System.out.println("The price for large cheese pizza is:  $" + (price = 25));
			System.out.println("do you want to add pepperoni? yes or not: ");
			addPepperoni = sc.next();
			if (addPepperoni.equals("yes")) {
				System.out.println("After adding additional pepperoni,the price  is: $ " + (price = (price) + 3));
			}

			System.out.println("do you want extra cheese? yes or not: ");
			addExtraCheese = sc.next();
			if (addExtraCheese.equals("yes")) {
				System.out.println("After adding extra cheese, the price is: $ " + (price = (price) + 1));
			}

			System.out.println("\n final bill is:" + price);
			break;
		default:
			System.out.println("your order is not match with our pizza menu.");

			break;
		}

	}
}
