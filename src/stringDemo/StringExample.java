package stringDemo;

import java.util.Scanner;

import java.util.Arrays;

public class StringExample {

	public static void main(String[] args) {
//
//		String name = "SwaroopKrishna";
//		char[] characterArray = name.toCharArray();
//
//		System.out.println(Arrays.toString(characterArray));
//
//		String firstAndLastName = "Rajinder Kaur";
//		String[] nameArray = firstAndLastName.split(" ");
//		System.out.println(firstAndLastName.length());
//		System.out.println(firstAndLastName.toUpperCase());
//		System.out.println(firstAndLastName.toLowerCase());
//		System.out.println(firstAndLastName.substring(2));
//		System.out.println("First Name:" + nameArray[0]);
//		System.out.println("Last Name:" + nameArray[1]);
//
//		String splitAString = "Arshpreet&wants&to&see&if&string&can&be&split&without&space";
//
//		String[] splitStringToArray = splitAString.split("&");
//
//		System.out.println(Arrays.toString(splitStringToArray));
//
//		String[] splitExample = splitAString.split("can");
//		System.out.println(Arrays.toString(splitExample));
//		
	
		
//		Scanner sc = new Scanner(System.in);
//		String[] capitalCities = { "Toronto", "QubecCity", "Winnipeg", "Victoria", "Edmonton", "Halifax", "Regina" };
//
//		
//		System.out.println("Enter city name");
//		String cityName = sc.next();
//
//		boolean isCityACapital = false;
//
//		for (int i = 0; i < capitalCities.length; i++) {
//			if (capitalCities[i].equals(cityName)) {
//				System.out.println("This is a capital city");
//				isCityACapital = true;
//				break;
//			}
//		}
//		if (!isCityACapital) {
//			System.out.println("This is not a capital city");
//		}
		
		
		String[] numberSyllables={"buf-fet","beau-ti-ful","mon-u-men-tal","on-o-mat-o-poe-ia"};
		for( int i=0;i<=numberSyllables.length;i++) {
	   if(numberSyllables[i].contains("-")) {
		   System.out.println((numberSyllables[i].split("-").length));
		   
	   }
	   
		}
//		
//		


	        String word = "hello";
	        System.out.println(word.substring(1,4));
	        System.out.println(word.endsWith("o"));
	        
	        
	}}
	

