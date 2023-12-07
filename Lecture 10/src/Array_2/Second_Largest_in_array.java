package Array_2;

public class Second_Largest_in_array {

	public static int secondLargestElement(int[] arr) {
		int Largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (Largest < arr[i]) {
				Largest = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Largest) {
				arr[i] = Integer.MIN_VALUE;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > secondLargest) {
				secondLargest = arr[i];

			}

		}
		return secondLargest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 6, 1, 9, 8, 9, 7 };
		int SL = secondLargestElement(arr);

		System.out.println(SL);
	}
}
