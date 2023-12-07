package classes_and_objects;

public class Student {
	public String Name;
	// final data members can be initialized as soon as they are declared
	private final int rollNumber;

	private static int numstudent;
//	public Student () {
//		rollNumber = 100;
//	}

//	public Student(String n) {
//		Name = n;
//	rollNumber = 100;
//	}

	public static int getNumStudents() {
		return numstudent;
	}
	
	public Student(String Name, int rollNumber) {
		// System.out.println(this);
		this.Name = Name;
		this.rollNumber = rollNumber;
		numstudent++;
	}

//	public void setRollNumber(int rn) {
//		if (rn <= 0) {
//			return;
//		}
//		rollNumber = rn;
//	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void print() {
		System.out.println(Name + " : " + rollNumber);
	}
}