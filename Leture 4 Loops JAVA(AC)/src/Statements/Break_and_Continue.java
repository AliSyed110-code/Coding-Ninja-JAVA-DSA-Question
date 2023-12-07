package Statements;

import java.util.Scanner;

public class Break_and_Continue {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		// continue statement

//		for (int i = 1; i <= 5; i++) {
//			if (i == 3) {
//				continue;
//			}
//			System.out.print(i);
//		}

		do {
			System.out.println("Enter the number : ");
			int n = s.nextInt();
			if (n % 10 == 0) {
				continue;
			}
			System.out.println("number was " + n);

		} while (true);

		// break Statement

//		do {
//			System.out.println("Enter the number");
//			int n = s.nextInt();
//			if (n % 10 == 0) {
//				break;
//			}
//			System.out.println(n);
//
//		} while (true);

//		for (int i = 1; i <= 5; i++) {
//			if (i == 3) {
//				break;
//			}
//			System.out.println(i);
//		}
//		System.out.println("I am out from the loop");

	}

}
