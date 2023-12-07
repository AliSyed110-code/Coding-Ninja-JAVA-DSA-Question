package Functions;

import java.util.Scanner;

public class Product_of_a_b {

	public static int product(int a, int b) {

		int mul = a * b;
		return mul;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();

		int ans = product(a, b);
		System.out.println(ans);

		ans = product(10, 8);
		System.out.println(ans);
	}

}
