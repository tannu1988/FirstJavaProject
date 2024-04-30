package stringDemo;

import java.util.Scanner;

public class StringAssignMain {


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		StringAssign stra= new StringAssign();
		//swap first&last name
		System.out.println("Enter First Name: ");
		String firstName=sc.next();
		System.out.println("Enter last Name: ");
		String lastName=sc.next();
		String firstAndLastName = stra.name(firstName, lastName);
		System.out.println(firstAndLastName);
		//Number Syllables
		stra.numberSyllables="buf-fet";
		stra.numberSyllables1="beau-ti-ful";
		stra.numberSyllables();
		//remove first & last character
		System.out.println("Enter a word:  ");
		String enteredWord=sc.next();
		String removeFirstLastWord=stra.word(enteredWord);
		System.out.println(removeFirstLastWord);
		//prefix
		System.out.println("Enter a word: ");
		String enterword=sc.next();
		System.out.println("enter start with word: ");
		String startWith=sc.next();
		boolean prefix=stra.word(enterword, startWith);
		System.out.println(prefix);
		//Suffix
		System.out.println("enter end word: ");
		String endWith=sc.next();
		boolean sufix=stra.prefixAndSufix(enterword, endWith);
		System.out.println(sufix);
		//print city from string
		String returnCity=stra.printCity(" [Last Day!] Beer Festival[Munich]");
		System.out.println(returnCity);
	}
}
