package Recursion_1;

public class Last_Index_of_Number {

	public static int lastIndex(int input[], int x) {
		return lastIndex(input, x, input.length - 1);
	}

	public static int lastIndex(int input[], int x, int LastIndex) {
		if (LastIndex == 0) {
			if (input[LastIndex] == x) {
				return 0;
			} else {
				return -1;
			}
		}

		if (input[LastIndex] == x) {
			return LastIndex;
		}
		int smallAns = lastIndex(input, x, LastIndex - 1);
		return smallAns;
	}

	public static void main(String[] args) {

		int input[] = { 9, 8, 10, 8 };
		int x = 8;
		System.out.println(lastIndex(input, x, input.length - 1));

	}
}
