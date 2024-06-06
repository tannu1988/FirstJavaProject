package comparison;

public class VotingAge {

	int personAge;
	final int votingAge = 18;
	String isPersonCitizen;

	void isPersonAbleToVote() {
		if (personAge >= votingAge && isPersonCitizen == "citizen") {
			System.out.println("The person eligible for voting");
		} else {
			System.out.println("The Person age must be 18 or 18 above for voting");
		}
	}

	/*
	 * void isNumberEvenOrOdd() { int number = 8; if(number % 2==0) {
	 * System.out.println("The number is Even"); }else {
	 * System.out.println("The number is Odd"); }
	 * 
	 * }
	 */
}