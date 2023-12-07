package Recursion_1;

public class Check_Palindrome_recursive {

	public static boolean isStringPalindrome(String input) {
		return (isStringPalindrome(input, 0, input.length() - 1));
	}

	public static boolean isStringPalindrome(String input, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			return true;
		}
		boolean check = true;
		if (input.charAt(startIndex) == input.charAt(endIndex)) {
			check = isStringPalindrome(input, startIndex + 1, endIndex - 1);
		} else {
			check = false;
		}
		return check;
	}

	public static void main(String[] args) {

		String input = "racecar";
		System.out.println(isStringPalindrome(input));
	}

}
