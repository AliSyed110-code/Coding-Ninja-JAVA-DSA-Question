package Functions;

import java.util.Scanner;

public class Factorial {

	public static int factorial(int n) {
		int f = 1;

		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		return f;

	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		
		int ans = factorial(n);
		
		System.out.println(ans);

	}

}
