package Recursion_1;

public class Check_store_better {

	// This function checks if the array is sorted from startIndex to end
	private static boolean checkStoredBetter(int input[], int StartIndex) {
		if (StartIndex >= input.length - 1) {
			return true;
		}
		if (input[StartIndex] > input[StartIndex + 1]) {
			return false;
		}
		boolean smallAns = checkStoredBetter(input, StartIndex + 1);
		return smallAns;
	}

	public static boolean checkStoredBetter(int input[]) {
		return checkStoredBetter(input, 0);
	}

	public static void main(String[] args) {

		int input[] = { 1, 2, 3, 4 };
		System.out.println(checkStoredBetter(input));

	}

}
