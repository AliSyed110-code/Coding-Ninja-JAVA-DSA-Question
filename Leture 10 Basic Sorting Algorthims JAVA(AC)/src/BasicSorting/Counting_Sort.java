package BasicSorting;

public class Counting_Sort {

	public static void CountingSort(int input[]) {
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			largest = Math.max(largest, input[i]);
		}
		int count[] = new int[largest + 1];

		for (int i = 0; i < input.length; i++) {
			count[input[i]]++;
		}
		// sorting
		int j = 0;
		for (int i = 0; i < count.length; i++) {
			while (count[i] > 0) {
				input[j] = i;
				j++;
				count[i]--;
			}
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
		CountingSort(input);
		print(input);
	}
}
