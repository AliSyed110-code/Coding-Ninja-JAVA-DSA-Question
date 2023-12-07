package Functions;

import java.util.Scanner;

public class Binomial_cofficient {

	public static int binomial(int n, int r) {
		
		int numerator = factorial(n);

		int denominator = factorial(r) * (factorial(n - r));

		int bino = numerator / denominator;
		return bino;

	}

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
		int r = s.nextInt();

		System.out.println(binomial(n, r));

	}

}
