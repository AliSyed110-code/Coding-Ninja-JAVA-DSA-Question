package classes_and_objects;

import java.util.Scanner;

public class StudentUse {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Student s1 = new Student("Ankush", 123);
//	System.out.println(s1);
//	System.out.println(s1.Name);
//	System.out.println(s1.getRollNumber());

		s1.print();
		// System.out.println(s1.numstudent);
		System.out.println(Student.getNumStudents());
	    //System.out.println(s1.getNumStudents());
	    //System.out.println(s1.Name);
	    //Student.numstudent = 10;

		// Student s2 = new Student();
		// s2.Name = "Manisha";
		// s2.setRollNumber(121);

//	System.out.println(s1.getRollNumber());
//	System.out.println(s1.Name);
//	//System.out.println(s2.Name);
//	
		// System.out.println(s1);

	}

}
