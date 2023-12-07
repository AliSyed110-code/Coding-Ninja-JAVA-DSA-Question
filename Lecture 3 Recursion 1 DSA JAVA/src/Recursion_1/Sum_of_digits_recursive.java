package Recursion_1;

public class Sum_of_digits_recursive {

	public static int sumOfDigits(int input) {
		// Write your code here

		int n = input % 10;
		if (input <= 0) {
			return 0;
		}
		input /= 10;
		int sum = n + sumOfDigits(input);
		return sum;
	}

	public static void main(String[] args) {

		int input = 130;
		System.out.println(sumOfDigits(input));
	}
}
