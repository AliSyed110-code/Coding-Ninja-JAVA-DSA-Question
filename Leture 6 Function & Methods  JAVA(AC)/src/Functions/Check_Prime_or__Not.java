package Functions;

import java.util.Scanner;

public class Check_Prime_or__Not {

//	only for n>=2
//	public static boolean isPrime(int n) {
//
//		if (n == 2) {
//			return true;
//		}
//
//		for (int i = 2; i <= n - 1; i++) {
//			if (n % i == 0) {
//				return false;
//			}
//		}
//		return true;
//
//	}

	public static void printPrime(int n) {

		for (int i = 2; i <= n - 1; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	public static boolean isPrime(int n) {

		if (n == 2) {
			return true;
		}

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		printPrime(n);

//		if (isPrime(n) == true) {
//			System.out.println("Prime Number");
//		} else {
//			System.out.println("Not Prime Number");
//		}

	}

}
