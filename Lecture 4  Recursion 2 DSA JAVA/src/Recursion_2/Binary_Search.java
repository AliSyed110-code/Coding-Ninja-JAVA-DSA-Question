package Recursion_2;

public class Binary_Search {

	public static int binarySearch(int input[], int element) {
		return helper(input, 0, input.length - 1, element);
	}

	private static int helper(int input[], int si, int ei, int element) {
		if (si > ei) {
			return -1;
		}
		int midIndex = (si + ei) / 2;
		if (input[midIndex] == element) {
			return midIndex;
		} else if (input[midIndex] < element) {
			return helper(input, midIndex + 1, ei, element);
		} else {
			return helper(input, si, midIndex - 1, element);
		}
	}

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 11, 14 };
		System.out.println(binarySearch(arr, 5));
	}

}
