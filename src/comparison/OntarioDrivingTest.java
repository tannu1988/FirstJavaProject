package comparison;

public class OntarioDrivingTest {
	int personAge;
	String currentLevelStatus;
	String personWrittenTest = "pass";
	void isPersonGetAG1OrG2OrG() {
		if (personAge >= 16) {
			if (currentLevelStatus == "G1") {
				System.out.println("Person get a License for driving test is: G2");
			} else if (currentLevelStatus == "G2") {
				System.out.println("Person get a License for driving test is: G");
			} else {
				System.out.println("Person is not eligible to get a license");
			}
		} else {
			System.out.println("Person age must be 16 or 16 above for get a Driving License");
	
 }
}
}