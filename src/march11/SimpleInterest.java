package march11;

public class SimpleInterest {
	double p = 2000;
	double rate = 4;
	int time = 2;
	double sinterest = 0;
	void calculateInterest() {
		sinterest = (p * rate * time) / 100;
		System.out.print("Simple Interest is: " + sinterest);
	}

}
