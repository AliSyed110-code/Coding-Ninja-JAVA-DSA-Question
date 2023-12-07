package Strings;

public class Palindrome {

	public static void printLetter(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}

	public static boolean checkPalindrome(String str) {

		for (int i = 0; i < str.length() / 2; i++) {
			int n = str.length();
			if (str.charAt(i) != str.charAt(n - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "racecar";
		System.out.println(checkPalindrome(str));
	}

}
