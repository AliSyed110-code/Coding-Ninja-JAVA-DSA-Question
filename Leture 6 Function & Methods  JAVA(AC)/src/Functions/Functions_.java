package Functions;

import java.util.Scanner;

public class Functions_ {

	public static void swap(int a, int b) {

		int temp = a;
		a = b;
		b = temp;

		System.out.println("a = " + a);
		System.out.println("b= " + b);

	}

	public static void printHelloWorld() {
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
	}

	public static int CalculateSum(int num1, int num2) {

		int sum = num1 + num2;
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		int a = s.nextInt();
//		int b = s.nextInt();
//
//		int sum = CalculateSum(a, b);
//		System.out.println(sum);

		int a = 5;
		int b = 10;

		swap(a, b);

	}

}
