package javaAssignment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class MainPerson {

	public static void main(String[] args) {
		Collection<Student>s = new ArrayList<>();
		ArrayList<Teacher>t = new ArrayList<>();
			Scanner sc=new Scanner(System.in);
			System.out.println("Please enter the student's name: ");
			String name=sc.next();
			System.out.println("Please enter the student's age: ");
			int age=sc.nextInt();
			System.out.println("Please enter the student's gender: ");
			String gender=sc.next();
			System.out.println("Please enter the student's academic percentage: ");
			double percentage=sc.nextDouble();
			System.out.println("------- Stream Allocation Result---------");
			Student student=new Student(name,age,gender,percentage);
			s.add(student);
			System.out.println(s);
		//	student.describeRole();
			System.out.println("Allocated Stream: "+student.determinrStream(percentage));
			Teacher teacher=new Teacher(12345,2500.0,"8",4,"alice johnson",23,"female");
		//	System.out.println(teacher.getRating());
		//	teacher.setRating(5);
			
			System.out.println("\n\n\nPlease enter the teacher's name you wish to rate: " +Teacher.getName());
		//	String tname=sc.next();
			System.out.println("Please enter your rating for " +Teacher.getName()+"[1-5]: "+Teacher.getRating());
		//	int rating=sc.nextInt();
		//	Teacher teacher=new Teacher(rating,percentage, tname,rating, tname, rating, tname);
		//	t.add(teacher);
			teacher.setRating(5);
			teacher.addRating(5);
			System.out.println("Please enter your rating for " +Teacher.getName()+"[1-5]: "+Teacher.getRating());
		//	System.out.println(t);
		//	System.out.println(teacher.getRating());
		//	System.out.println(teacher.getName());   
			
//			System.out.println(StreamAllocationResult);
//			System.out.println(student.determinrStream(87));
			
	}

}
