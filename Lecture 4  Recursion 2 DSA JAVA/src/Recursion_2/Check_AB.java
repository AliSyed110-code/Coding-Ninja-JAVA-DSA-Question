package Recursion_2;

public class Check_AB {

	public static boolean checkAB(String input) {

		int len = input.length();

		if (len == 0) {
			return true;
		}
		boolean smallAns = false;

		// take all cases one by one

		if (len == 1) {
			if (input.charAt(0) == 'a') {
				smallAns = true;
				input = input.substring(1, len);
			}
		} else if (len == 2) {
			if (input.charAt(0) == 'a' && input.charAt(1) == 'a') {
				smallAns = true;
				input = input.substring(2, len);
			}
		} else if (len >= 3) {
			if (input.charAt(0) == 'a' && input.substring(1, 3).equals("bb")) {
				smallAns = true;
				input = input.substring(3, len);
			}

			else if (input.charAt(0) == 'a' && input.charAt(1) == 'a') {
				smallAns = true;
				input = input.substring(1, len);
			}
		}
		return smallAns && checkAB(input);
	}

	public static void main(String[] args) {

		String input = "abb";
		System.out.println(checkAB(input));
	}

}
