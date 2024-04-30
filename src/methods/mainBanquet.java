package methods;

import java.util.Scanner;

public class mainBanquet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Banquet bnqt = new Banquet(0, 0, 0, 0);

		System.out.println("Enter cost of booking: ");
		int baseCost = sc.nextInt();
		System.out.println("Enter cost of food: ");
		int foodCost = sc.nextInt();
		System.out.println("Enter cost of beverages: ");
		int beverageCost = sc.nextInt();
		System.out.println("Enter cost of tip: ");
		int tip = sc.nextInt();
		int calculateCostOfBase = bnqt.calculateBaseCost(baseCost, foodCost,beverageCost,tip);

		System.out.println("The banquet base cost is: " + calculateCostOfBase);
		double taxOnBaseCost = bnqt.calculateTax(calculateCostOfBase);
		System.out.println("The 18% tax on base cost is: " + taxOnBaseCost);

		System.out.println("Enter Number of Guest: ");
		int noOfGuest = sc.nextInt();
		double cessTax = bnqt.calculateCess(noOfGuest, calculateCostOfBase);
		System.out.println("The cess tax on no. of guests is: " + cessTax);
		double totalCost = bnqt.calculateTotalCost(calculateCostOfBase, taxOnBaseCost, cessTax);
		System.out.println("The total cost of banquet hall is: " + totalCost);

	}

}
