package linkesList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class PersonClassLL {

	public static void main(String[] args) {
		LinkedList<String> name = new LinkedList<String>();

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
		name.add("Avneet");
		name.add("Prabhneet");
		name.add("Taranpreet");
		for (int i = 0; i < name.size(); i++) {
			System.out.println(name.get(i));
		}

		System.out.println(name);
		System.out.println(name.size());
		System.out.println(name.add("Navjot"));
		System.out.println(name);
		Collections.sort(name);
		System.out.println("________________________________-");
		System.out.println(name.getLast());
		System.out.println("_________________________________________");

		HashSet<String> name1 = new HashSet<String>();
		name1.add("Gurjaap");
		name1.add("Gurnaaz");
		name1.add("Avneet");
		name1.add("Manpreet");
		name1.add("Taranpreet");
		name1.add("Gurleen");
		name1.add("Jaskaran");
		name1.add("Prabhneet");
		name1.add("Prabhjot");
		name1.add("Prabhleen");
		name1.add("Avneet");
		name1.add("Prabhneet");
		name1.add("Taranpreet");
		
		System.out.println(name1);
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Duplicate name: ");
//			String duplicateName = sc.next();
//			if (name1.equals(duplicateName)) {
//				System.out.println(name1.remove(duplicateName));
//			}else {System.out.println(name1);}
	
		}
	}

