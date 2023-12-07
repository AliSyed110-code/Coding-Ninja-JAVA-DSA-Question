package Practice;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Enter any positive integer:");
		int n = s.nextInt();
		int fac = 1;
		while (n > 0) {
			fac = fac * (n);
			n--;
		}
		System.out.println("Factorial is "  + fac);

	}
}
