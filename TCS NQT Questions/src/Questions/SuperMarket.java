package Questions;

import java.util.Scanner;

public class SuperMarket {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String n = s.next();
		long ans = 1;

		int l = n.length();
		int val = 0;
		for (int i = 0; i < l; i++) {
			val = n.charAt(i) - '0';
			ans = ans * val;
		}
		System.out.println(ans);
	}
}
