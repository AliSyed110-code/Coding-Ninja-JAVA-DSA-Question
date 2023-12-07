package Array_2;

public class Rotation_array {

	public static void rotate(int[] arr, int d) {
		if (d <= 0)
			return;
		if (d > arr.length)
			d = d - arr.length;
		reverseArray(arr, 0, arr.length - 1);
		reverseArray(arr, 0, arr.length - 1 - d);
		reverseArray(arr, arr.length - d, arr.length - 1);

	}

	private static void reverseArray(int[] arr, int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;

		}
	}

	public static void main(String[] args) {

		int arr[] = { 2, 6, 3, 1, 5, 9, 8 };
		rotate(arr, 2);
	}

}
