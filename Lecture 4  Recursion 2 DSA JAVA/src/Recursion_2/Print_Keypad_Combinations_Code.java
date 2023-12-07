package Recursion_2;

public class Print_Keypad_Combinations_Code {
	public static void printKeypad(int input, String outputSofar) {
		if (input == 0) {
			System.out.println(outputSofar);
			return;
		}

		char ch[] = helper(input % 10);
		for (int i = 0; i < ch.length; i++) {
			printKeypad(input / 10, ch[i] + outputSofar);
		}
	}

	public static void printKeypad(int input) {

		printKeypad(input, "");

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
		printKeypad(num);
	}
}
