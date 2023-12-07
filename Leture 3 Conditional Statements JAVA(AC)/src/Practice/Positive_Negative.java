package Practice;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		if (n > 0) {
			System.out.println(n + " : Positive Number");
		} else {
			System.out.println(n + " : Negative Number");
		}
	}

}
