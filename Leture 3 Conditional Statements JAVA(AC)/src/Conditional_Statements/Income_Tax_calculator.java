package Conditional_Statements;

import java.util.Scanner;

public class Income_Tax_calculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int income = s.nextInt();
		int tax = 0;

		if (income < 500000) {
			tax = 0;
		} else if (income > 5 && income < 1000000) {
			tax = (int) (income * (0.2));
		} else {
			tax = (int) (income * (0.2));
		}
		System.out.println("Your tax is " + tax);
	}

}
