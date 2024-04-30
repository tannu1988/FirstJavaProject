package methods;

public class Banquet {
	int baseCost;
	int foodCost;
	int beveragesCost;
	int tip;
	public Banquet(int baseCost, int foodCost, int beveragesCost,int tip ) {
		
		this.baseCost=baseCost;
		this.foodCost=foodCost;
		this.beveragesCost=beveragesCost;
		this.tip=tip;
	}

	public int calculateBaseCost(int baseCost, int foodCost, int beverageCost, int tip) {
		int totalBaseCost = baseCost + foodCost + beverageCost + tip;
		return totalBaseCost;

	}

	public double calculateTax(int totalBaseCost) {
		double valueOfTax = (totalBaseCost * .18);
		return valueOfTax;

	}

	public double calculateCess(int noOfGuest, int taxOnBaseCost) {
		double cessTax = 0;
		if (noOfGuest <= 40) {
			cessTax = ((taxOnBaseCost) * 4 / 100);
		}
		if (noOfGuest > 40 && noOfGuest <= 80) {
			cessTax = ((taxOnBaseCost) * 8 / 100);
		}
		if (noOfGuest > 80 && noOfGuest < 150) {
			cessTax = ((taxOnBaseCost) * 10 / 100);
		}
		if (noOfGuest > 150) {
			cessTax = ((taxOnBaseCost) * 12.5 / 100);
		}
		return cessTax;

	}

	public double calculateTotalCost(int totalBaseCost, double valueOfTax, double cessTax) {
		double totalCost = totalBaseCost + valueOfTax + cessTax;
		return totalCost;

	}
}