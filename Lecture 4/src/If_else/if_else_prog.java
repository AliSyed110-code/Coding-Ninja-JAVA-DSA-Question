package If_else;

import java.util.Scanner;

public class if_else_prog {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a % 2 == 0)
			System.out.println("Number is Even");

		else
			System.out.println("Number is odd");

	}

}
