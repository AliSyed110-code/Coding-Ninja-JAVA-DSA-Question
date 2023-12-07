package Questions;

import java.util.Scanner;

public class Intelligence_agency {

	public static int AddSingleDigit(String str, int n) {

		if (n == 0) {
			return 0;
		}
		int res = sumofDigit(str);
		res = res * n;

		while (res > 9) {
			String x = " " + res;
			res = sumofDigit(x);
		}
		return res;
	}

	public static int sumofDigit(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum = sum + str.charAt(i) - '0';
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		String str = s.next();
		int n = s.nextInt();

		System.out.println(AddSingleDigit(str, n));
	}

}
