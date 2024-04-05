package comparison;

public class ComparisonOperator {
	int num1 = 20;
	int num2 = 30;
	boolean value = false;

	void isNum1GreaterThanNum2() {
		value = num1 > num2;
		System.out.println("The value is:  " + value);
	}

	void isNum1LessThanNum2() {
		value = num1 < num2;
		System.out.println("The value is:  " + value);
	}

	void isNum1GreaterThanEqualToNum2() {
		value = num1 >= num2;
		System.out.println("The value is:  " + value);
	}

	void isNum1LessThanEqualToNum2() {
		value = num1 <= num2;
		System.out.println("The value is:  " + value);
	}

	void isNum1EqualToEqualToNum2() {
		value = num1 == num2;
		System.out.println("The value is:  " + value);
	}
}
