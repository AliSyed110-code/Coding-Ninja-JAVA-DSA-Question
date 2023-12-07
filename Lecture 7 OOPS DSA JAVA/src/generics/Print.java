package generics;

import final_keyword.Vehicle;

public class Print {

	public static <T extends PrintInterface> void PrintArray(T a[]) {
		for (int i = 0; i < a.length; i++) {
			a[i].print();
			System.out.print(" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		Integer a[] = new Integer[10];

		for (int i = 0; i < 10; i++) {
			a[i] = i + 1;
		}

		String s[] = new String[10];
		for (int i = 0; i < 10; i++) {
			s[i] = "abc";
		}
		//PrintArray(s);
		//PrintArray(a);

		Student s1[] = new Student[10];
		for(int i = 0 ; i<10;i++) {
			s1[i] = new Student();
		}
		PrintArray(s1);
	}
}
