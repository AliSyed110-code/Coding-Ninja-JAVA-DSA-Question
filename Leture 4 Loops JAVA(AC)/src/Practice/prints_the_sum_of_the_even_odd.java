package Practice;

import java.util.Scanner;

public class prints_the_sum_of_the_even_odd {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int number;
		int choice;
		int evenSum = 0;
		int oddSum = 0;

		do {

			System.out.println("Enter the Number");
			number = s.nextInt();

			if (number % 2 == 0) {
				evenSum += number;
			} else {
				oddSum += number;
			}
			System.out.print("Doyou want to continue? Press 1 foryes or 0 for no ");

			choice = s.nextInt();
		} while (choice == 1);

		System.out.println("Sum of even numbers: " + evenSum);
		System.out.println("Sum of odd numbers: " + oddSum);
	}

}
