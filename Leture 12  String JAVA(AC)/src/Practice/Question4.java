package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Question4 {

	public static boolean CheckAnagrams(char[] str1, char[] str2) {

		int n1 = str1.length;
		int n2 = str2.length;

		if (n1 != n2) {
			return false;
		}

		Arrays.sort(str1);
		Arrays.sort(str2);

		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != str2[i]) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {

		char[] str1 = { 'r', 'a', 'c', 'e' };
		char[] str2 = { 'c', 'a', 'r', 'e' };

		if (CheckAnagrams(str1, str2)) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}

	}

}
