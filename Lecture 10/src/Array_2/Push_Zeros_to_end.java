package Array_2;

public class Push_Zeros_to_end {

	public static void pushZerosAtEnd(int[] arr) {
		int i = 0;
		int k = 0;
		while (i < arr.length) {

			if (arr[i] != 0) {
				int temp;
				temp = arr[k];
				arr[k] = arr[i];
				arr[i] = temp;
				k++;
				i++;
			}
			if (arr[i] == 0) {
				i++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 6, 0, 0, 1, 9, 0, 8, 0 };
		pushZerosAtEnd(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
