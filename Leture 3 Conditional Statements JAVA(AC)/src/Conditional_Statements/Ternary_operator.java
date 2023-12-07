package Conditional_Statements;

import java.util.Scanner;

public class Ternary_operator {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//		int number = 5;
//
//		String type = ((number % 2) == 0) ? "Even" : "Odd";
//
//		System.out.println(type);

		int mark = s.nextInt();

		String type = (mark >= 33) ? "PASS" : "FAIL";
		System.out.println(type);
	}

}
