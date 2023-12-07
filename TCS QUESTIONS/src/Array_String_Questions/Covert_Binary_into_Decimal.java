package Array_String_Questions;

import java.util.Scanner;

public class Covert_Binary_into_Decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ans = 0;
		int pow = 0;
		while (n != 0) {
			int rem = n % 10;
			int mul = (int) Math.pow(2, pow);
			 n  = n / 10;
			 pow++;
			 ans = ans + mul*rem;
		}
		System.out.print(ans);
	}
}
