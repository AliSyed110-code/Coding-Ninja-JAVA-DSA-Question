package BasicSorting;

public class BubbleSort {

	public static void bubbleSort(int input[]) {
		for (int i = 0; i < input.length - 1; i++) {
			int swap = 0;
			for (int j = 0; j < input.length - 1 - i; j++) {
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
					swap++;
				}
				if (swap == 0) {
					break;
				}
			}
		}
	}

	public static void print(int input[]) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	public static void main(String[] args) {

//		int input[] = { 5, 4, 1, 3, 2 };
		int input[] = { 1, 2, 3, 4, 5 };
		bubbleSort(input);
		print(input);
	}

}
