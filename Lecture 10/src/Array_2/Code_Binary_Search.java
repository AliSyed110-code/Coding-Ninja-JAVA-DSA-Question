package Array_2;

public class Code_Binary_Search {

	public static int binarySearch(int[] arr, int x) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (x == arr[mid]) {
				return mid;
			} else if (x > arr[mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 8, 15, 21, 28 };
		int index = binarySearch(arr, 8);
		System.out.println(index);
	}
}
