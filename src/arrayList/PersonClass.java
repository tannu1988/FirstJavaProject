package arrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class PersonClass {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Gurjaap");
		name.add("Gurnaaz");
		name.add("Avneet");
		name.add("Manpreet");
		name.add("Taranpreet");
		name.add("Gurleen");
		name.add("Jaskaran");
		name.add("Prabhneet");
		name.add("Prabhjot");
		name.add("Prabhleen");
		System.out.println(name);
		System.out.println(name.size());
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of the person: ");
		String personName = sc.next();
		if (name.contains(personName)) {
			System.out.println("Person is present in the list at the index[]  : " + name.indexOf(personName));
		} else {
			System.out.println("Person is not present in the list");
		}
	}

}
