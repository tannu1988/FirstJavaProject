package stringDemo;

public class StringAssign {
	String numberSyllables;
	String numberSyllables1;
	String grabCity;
	public void numberSyllables() {
	
	System.out.println(numberSyllables.split("-").length);
	System.out.println(numberSyllables1.split("-").length);
		  
		   } 
	
	public String name(String firstName, String lastName) {
		String swapName = lastName + " " + firstName;
		return swapName;
	}

	
public String word(String enteredWord) {
	String removeFirstLast=enteredWord.substring(1, enteredWord.length()-1);
	return removeFirstLast;
}
	
public boolean word(String enteredWord,String starWith) {
	boolean wordStartWith=enteredWord.startsWith(starWith);
	
	return wordStartWith;

}
public boolean prefixAndSufix(String enteredWord, String endWith) {
	boolean wordEndWith=enteredWord.endsWith(endWith);
	
	return wordEndWith;

	}
public String printCity(String grabCity) {
	String city=grabCity.substring(grabCity.lastIndexOf("[")+1,grabCity.lastIndexOf("]"));
	return city;
}
}