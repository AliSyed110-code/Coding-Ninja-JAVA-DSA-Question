package Array;

public class Largest_in_Array {

	public static int largestArray(int input[]) {

		int largest = Integer.MIN_VALUE;
		int smallest = Integer.MAX_VALUE;

		for (int i = 0; i < input.length; i++) {
			if (input[i] > largest) {
				largest = input[i];
			}
			if (smallest > input[i]) {
				smallest = input[i];
			}
		}
		System.out.println(smallest);
		return largest;
	}

	public static void main(String[] args) {

		int input[] = { 1, 2, 6, 3, 5 };

		System.out.println(largestArray(input));
	}

}
