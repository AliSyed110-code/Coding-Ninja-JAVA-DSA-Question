package Array_2;

public class Sort_0_1_2 {

	public static void sort012(int[] arr) {
		int zeros = 0;
		int twos = arr.length - 1;
		int i = 0;
		while (i <= twos) {
			if (arr[i] == 0) {
				int temp = arr[zeros];
				arr[zeros] = arr[i];
				arr[i] = temp;
				zeros++;
				i++;
			} else if (arr[i] == 2) {
				int temp = arr[twos];
				arr[twos] = arr[i];
				arr[i] = temp;
				twos--;
			} else {
				i++;
			}
		}

	}

	public static void main(String[] args) {
		int arr[] = { 1, 0, 2, 1, 0, 1, 2, 0 };
		sort012(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}