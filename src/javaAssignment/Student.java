package javaAssignment;

public class Student extends Person {
	private int studentId;
	private double percentage;

	public Student(String name, int age, String gender, double percentage) {
		super(name, age, gender);
		this.percentage = percentage;
	}

	public String determinrStream(double percentage) {
		if (percentage >= 80) {
			return "Non-Medical";
		} else if (percentage >= 75 && percentage <= 84.99) {
			return "Medical";// System.out.println("Stream Medical");
		} else if (percentage >= 65 && percentage <= 74.99) {
			return "Commerce";
		} else if (percentage <= 65) {
			return "Stream Arts";// System.out.println("Stream Arts");
		} else {
			return null;
		}

	}

	public double getPercentage() {
		return percentage;
	}

	@Override
	public void describeRole() {
		if (getName() == getName()) {
			System.out.println("person is student");
		}
	}
	public int rateTeacher(Teacher teacher,int rating) {
		return rating;
		
	}

	@Override
	public String toString() {
		return "Student [percentage=" + percentage + ", getAge()=" + getAge() + ", getGender()=" + getGender()
				+ ", getName()=" + getName() + "]";
	}

}
