package Array_2;

public class Selection_Sort_Code {

	public static void SelectionSortCode(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) { // 0 to length-2
			int min = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;

			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 2, 6, 9, 1, 5 };
		SelectionSortCode(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}

	}

}
