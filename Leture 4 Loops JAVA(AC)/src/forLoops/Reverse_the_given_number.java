package forLoops;

import java.util.Scanner;

public class Reverse_the_given_number {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int rev = 0;
		while (n > 0) {
			int ld = n % 10;
			rev = (rev * 10) + ld;
			n = n / 10;
		}
		System.out.println(rev);
	}

}
