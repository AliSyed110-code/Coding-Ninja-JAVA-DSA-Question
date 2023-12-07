package Functions;

public class palindrome {

	public static boolean checkPalindrome(int n) {

		int palin = n;
		int rev = 0;

		while (palin != 0) {
			int rem = palin % 10;
			rev = rem + rev * 10;
			palin = palin / 10;
		}

		if (n == rev) {

			return true;

		}
		return false;

	}

	public static void main(String[] args) {

		System.out.println(checkPalindrome(1331));
	}

}
