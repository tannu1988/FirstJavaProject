package arrayList;

public class Person {

	String name;
	int age;
	int rollNo;
	String phoneNo;
	public Person(String name, int age, int rollNo, String phoneNo) {
		super();
		this.name = name;
		this.age = age;
		this.rollNo = rollNo;
		this.phoneNo=phoneNo;

	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", phoneNo=" + phoneNo + "]";
	}
	

}
