package BasicSorting;

public class SelectionSort {

	public static void selectionSort(int input[]) {
		for (int i = 0; i < input.length - 1; i++) {
			int minPos = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[minPos] > input[j]) {
					minPos = j;
				}
			}
			int temp = input[minPos];
			input[minPos] = input[i];
			input[i] = temp;
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
		selectionSort(input);
		print(input);
	}

}
