package hashmap;

import java.util.ArrayList;
import java.util.HashMap;

import arrayList.Person;

public class StudentD {

	public static void main(String[] args) {
		HashMap<Integer,String> name = new HashMap<Integer,String>();
		name.put(1,"Gurjaap");
		name.put(2,"Gurnaaz");
		name.put(3,"Avneet");
		name.put(4,"Manpreet");
		name.put(5,"Taranpreet");
		name.put(6,"Gurleen");
		name.put(7,"Jaskaran");
		name.put(8,"Prabhneet");
		name.put(9,"Prabhjot");
		name.put(10,"Prabhleen");
		for(int i=1;i<name.size();i++) {
			System.out.println(name.get(i));
		}
		System.out.println("Print the name : "+name.get(2));
		name.put(11,"Jasleen");
		System.out.println("Print the List: "+name);
		System.out.println("Print the name : "+name.replace(7,"Jasleen"));
		System.out.println("Print the name : "+name);
		System.out.println("Print the name : "+name.remove(11));
		System.out.println("Print the name : "+name);
		System.out.println("Print the name : "+name);
		System.out.println("________________________________________");
		
		HashMap<Integer,Person> personDetail = new HashMap<Integer,Person>();
		personDetail.put(1,new Person("Avneet",25,01,"1234567890"));
		personDetail.put(2,new Person("Gurjaap",22,02,"5647839107"));
		personDetail.put(3,new Person("Gurnaaz",28,03,"3344556677"));
		System.out.println(personDetail);
		System.out.println(personDetail.get(3));
		System.out.println(personDetail.get(2).toString()); 
		int x=16;
		System.out.println(Math.sqrt(x));
	}

}
