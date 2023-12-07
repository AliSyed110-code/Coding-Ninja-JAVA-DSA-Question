package OOPS;

public class StudentUse {

	public static void main(String[] args) {

		Student s1 = new Student();

		s1.name = "Ali";
		s1.age = 23;

		s1.PrintInfo(s1.name);
		s1.PrintInfo(s1.age);
		s1.PrintInfo(s1.name,s1.age);

//		Student s2 = new Student(s1);
//		s2.PrintInfo();
//		s1.PrintInfo();

	}
}
