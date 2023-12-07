package Conditional_Statements;

import java.util.Scanner;

public class largest_of_3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		if (a >= b && a >= c) {
			System.out.println("A is greater");
		} else if (b >= c) {
			System.out.println("B is greater");
		} else {
			System.out.println("c is greater");
		}
	}
}
