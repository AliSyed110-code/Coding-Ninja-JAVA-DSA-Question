package Array;

public class ReverseArray {

	public static void reverse(int input[]) {
		int first = 0;
		int last = input.length - 1;

		while (first < last) {

			int temp = input[last];
			input[last] = input[first];
			input[first] = temp;
			first++;
			last--;
		}
	}

	public static void main(String[] args) {

		int[] input = { 2, 4, 6, 8, 10 };
		reverse(input);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		System.out.println();
	}

}
