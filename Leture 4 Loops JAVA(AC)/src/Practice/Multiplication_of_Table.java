package Practice;

import java.util.Scanner;

public class Multiplication_of_Table {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter number:");
		int n = s.nextInt();
		for (int i = 1; i <= 10; i++) {
			int multi = n * i;
			System.out.println(n + " X  " + i + " = " + multi);
		}

	}

}
