package Recursion_1;

public class Number_of_Digits {

	public static int count(int n) {
		if (n == 0) {
			return 0;
		}
		int small = count(n / 10);
		int ans = small + 1;
		return ans;
	}

	public static void main(String[] args) {

		int n = 12;
		System.out.println(count(n));
	}

}
