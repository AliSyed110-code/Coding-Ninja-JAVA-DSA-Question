package BasicSorting;

public class InsertionSort {

	public static void InsertionSort(int input[]) {
		for (int i = 1; i < input.length ; i++) {
			int curr = input[i];
			int prev = i - 1;
			while (prev >= 0 && input[prev] > curr) {
				input[prev + 1] = input[prev];
				prev--;
			}

			input[prev + 1] = curr;
		}
	}

	public static void print(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	public static void main(String[] args) {

		int input[] = { 5, 4, 1, 3, 2 };
//		int input[] = { 1, 2, 3, 4, 5 };
		InsertionSort(input);
		print(input);
	}

}
