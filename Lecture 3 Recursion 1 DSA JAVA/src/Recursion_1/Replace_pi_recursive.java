package Recursion_1;

public class Replace_pi_recursive {

	public static String replace(String input) {
		if (input.length() == 0 || input.length() == 1)
			return input;
		String sub = input.substring(0, 2);
		if (sub.equals("pi")) {
			String smallans = replace(input.substring(2));
			return 3.14 + smallans;
		} else {
			return input.charAt(0) + replace(input.substring(1));
		}

	}

	public static void main(String[] args) {

		String input = "xpixpi";
	  System.out.println(replace(input));
	}

}
