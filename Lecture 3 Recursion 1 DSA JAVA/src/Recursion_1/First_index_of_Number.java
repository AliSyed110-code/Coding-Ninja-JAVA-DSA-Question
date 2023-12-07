package Recursion_1;

public class First_index_of_Number {

	public static int firstIndex(int input[], int x) {
		return  firstIndex(input, x,0);
	}
	
	public static int firstIndex(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			return -1;
		}
		if (x == input[startIndex]) {
			return startIndex;
		}
		int smallInput = firstIndex(input, x, startIndex + 1);
		return smallInput;
	}

	public static void main(String[] args) {

		int input[] = { 9, 8, 10, 8 };
		int x = 9;
		System.out.println(firstIndex(input, x, 0));

	}

}
	
