package Assignment;

import java.util.HashSet;

public class Question1 {

	public static boolean checkNumber(int input[]) {
		for (int i = 0; i < input.length; i++) {
			for (int j = i + 1; j < input.length; j++) {
				if (input[i] == input[j]) {
					return true;
				}
			}
		}
		return false;
	}

	//Best Approach
	public static boolean checkNumber2(int input[]) {
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < input.length; i++) {
			if (set.contains(input[i])) {
				return true;
			} else {
				set.add(input[i]);
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 1 };
		System.out.println(checkNumber(input));
		System.out.println(checkNumber2(input));
	}
}
