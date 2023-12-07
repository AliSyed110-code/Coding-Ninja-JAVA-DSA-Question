package Recursion_1;

public class Pair_Star {

	public static String addStars(String s) {
		if (s.length() == 1) {
			return s;
		}
		String smallAns = addStars(s.substring(1));
		if (s.charAt(0) == smallAns.charAt(0)) {
			return s.charAt(0) + "*" + smallAns;
		} else
			return s.charAt(0) + smallAns;
	}

	public static void main(String[] args) {
		String s = "hello";
		System.out.println(addStars(s));
	}

}
