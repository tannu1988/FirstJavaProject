package march11;

public class MainCalculateDiscount {

	public static void main(String[] args) {
		CalculateDiscount ca = new CalculateDiscount();
		ca.productPrice = 3000;
		ca.promoCode = "promo5";
		ca.isPersonUsePromocode();
	}

}
