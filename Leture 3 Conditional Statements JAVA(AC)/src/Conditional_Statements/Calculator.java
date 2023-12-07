package Conditional_Statements;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter 1st Value");
		int a = s.nextInt();
		System.out.println("Enter 2nd Value");
		int b = s.nextInt();
		System.out.println("Enter Operator");
		char operator = s.next().charAt(0);

		switch (operator) {
		case '+':
			System.out.println(a + b + " ANS");
			break;
		case '-':
			System.out.println(a - b + " ANS");
			break;
		case '*':
			System.out.println(a * b + " ANS");
			break;
		case '/':
			System.out.println(a / b + " ANS");
			break;
		case '%':
			System.out.println(a % b + " ANS");
			break;
		default:
			System.out.println("Wrong Operator");

		}

	}

}
