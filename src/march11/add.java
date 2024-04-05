package march11;

public class add {
	String name = "Nancy";
	int age = 25;
	int a = 5;
	int b = 2;
	double c = a;
	int sum = 0;
	int sum2 = 0;

	void addnumtwo() {
		sum = a + b;
		sum2 = a % b;
		System.out.println("The sum of two num(a&b) is:" + sum);
		System.out.println(sum2);
	}

	void addnumthree() {
		System.out.println(a + b + c);
	}

	void convertValue() {

		System.out.println("convert the value of integer a into double is =" + c);

	}

	void nameLenght() {
		System.out.println("The lenght of the name is =" + name.length());
	}
}
