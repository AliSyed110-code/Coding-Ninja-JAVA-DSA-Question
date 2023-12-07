package Array;

import java.util.Scanner;

public class Input_Output {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		int marks[] = new int[n];

//		marks[0] = s.nextInt();
//		marks[1] = s.nextInt();
//		marks[2] = s.nextInt();
//
//		System.out.println("Phy : " + marks[0]);
//		System.out.println("Chem: " + marks[1]);
//		System.out.println("Math: " + marks[2]);
//
//		int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//		System.out.println("Percentage " + percentage + " %");

		for (int i = 0; i <= marks.length - 1; i++) {
			marks[i] = s.nextInt();
		}
		for (int i = 0; i <= marks.length - 1; i++)
			System.out.println(marks[i]);
	}

}
