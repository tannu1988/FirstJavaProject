package learnInheritance;

public class TwoWheeler extends Vehicle {

	protected double increasePriceBy = 0.20; // 0.2 times
	 public void finalPrice() {
	    basePrice = basePrice + (basePrice * increasePriceBy);
	    System.out.println("After modification, The price of bike is: Rs." + basePrice);
}
}
