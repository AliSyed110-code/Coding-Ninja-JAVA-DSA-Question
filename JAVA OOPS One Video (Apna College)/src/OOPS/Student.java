package OOPS;

public class Student {

	String name;
	int age;

//	public Student(Student s2) {
//		this.name = s2.name;
//		this.age = s2.age;
//	}
//	public Student() {
//		
//	}

	public void PrintInfo(String name) {
		System.out.println(name);
	}

	public void PrintInfo(int age) {
		System.out.println(age);
	}

	public void PrintInfo(String name, int age) {
		System.out.println(name+" "+age);
	}

}
