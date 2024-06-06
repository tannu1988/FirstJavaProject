package javaAssignment;

public class Teacher extends Person {
	private int employeeID;
	private double salary;
	private String coursesTaught;
	private static  int rating;
	public Teacher(int employeeID, double salary, String coursesTaught, int rating,String name,int age,String gender) {
		super(name,age,gender);
		this.employeeID = employeeID;
		this.salary = salary;
		this.coursesTaught=coursesTaught;
		this.rating = rating;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setCoursesTaught(String coursesTaught) {
		this.coursesTaught = coursesTaught;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public double getSalary() {
		return salary;
	}
	public String getCoursesTaught() {
		return coursesTaught;
	}
	public static int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	void describeRole() {
		if (getName() == getName()) {
			System.out.println("person is teacher");
		}
		
	}
	public int addRating(int rating) {
		return rating;
	}
	
}
