package march11;

public class MainAdd {

	public static void main(String[] args) {
		add add = new add();
		add.addnumtwo();
		add.addnumthree();
		add.convertValue();
		add.nameLenght();
		int personAge = add.age;
		System.out.println(personAge);
		String personName = add.name;
		System.out.println("The name is :" + personName);
		System.out.println("The age of the " + personName + " is:" + personAge);
	}

}
