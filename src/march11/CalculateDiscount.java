package march11;

public class CalculateDiscount {
	int productPrice;
	String promoCode;
	double discountProduct;
	double additionalDiscount;

	// promo5 = 5% , promo10 = 10% , promo20 = 20%
	void isPersonUsePromocode() {
		discountProduct = productPrice - (productPrice * 50 / 100);
		if (promoCode == "promo5") {
			additionalDiscount = discountProduct - (discountProduct * 5 / 100);
			System.out.println("Person get a additional 5% discount on products is: " + additionalDiscount);
		} else if (promoCode == "promo10") {
			additionalDiscount =discountProduct - (discountProduct * 10 / 100);
			System.out.println("Person get a additional 10% discount on products" + additionalDiscount);
		} else if (promoCode == "promo20") {
			additionalDiscount =discountProduct - (discountProduct * 20 / 100);
			System.out.println("Person get a additional 20% discount on products" + additionalDiscount);
		} else {
			System.out.println(
					"If person not use any promo code then get only 50% discount on all products: " + discountProduct);
		}

	}
}
