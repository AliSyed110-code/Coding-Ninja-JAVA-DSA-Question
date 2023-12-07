package Recursion_2;

public class Return_Keypad_Code {

	public static String[] keypad(int n) {
		if (n == 0) {
			String ans[] = { "" };
			return ans;
		}
		String[] small = keypad(n / 10);
		char[] ch = helper(n % 10);
		String[] ans = new String[small.length * ch.length];
		int k = 0;
		for (int i = 0; i < small.length; i++) {
			for (int j = 0; j < ch.length; j++) {
				ans[k] = small[i] + ch[j];
				k++;
			}
		}
		return ans;

	}

	public static char[] helper(int n) {
		if (n == 2) {
			char[] ch = { 'a', 'b', 'c' };
			return ch;
		} else if (n == 3) {
			char[] ch = { 'd', 'e', 'f' };
			return ch;
		} else if (n == 4) {
			char[] ch = { 'g', 'h', 'i' };
			return ch;
		} else if (n == 5) {
			char[] ch = { 'j', 'k', 'l' };
			return ch;
		} else if (n == 6) {
			char[] ch = { 'm', 'n', 'o' };
			return ch;
		} else if (n == 7) {
			char[] ch = { 'p', 'q', 'r', 's' };
			return ch;
		} else if (n == 8) {
			char[] ch = { 't', 'u', 'v', };
			return ch;
		} else {
			char[] ch = { 'w', 'x', 'y', 'z' };
			return ch;
		}
	}

	public static void main(String[] args) {

		int num = 234;
		String ans[] = keypad(num);
		for (int i = 0; i < ans.length; i++) {
			System.out.println(ans[i]);
		}

	}

}
