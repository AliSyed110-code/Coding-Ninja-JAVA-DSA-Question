package Conditional_Statements;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + ": is Even");
		} else {
			System.out.println(n + ": is Odd");
		}

	}

}
