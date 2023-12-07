package Array_2;

public class Check_array_rotation {

	public static int arrayRotateCheck(int[] arr) {
		int value = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {

				value = i + 1;
				break;
			}
		}
		return value;
	}

	public static void main(String[] args) {

		int arr[] = { 5, 6, 1, 2, 3, 4 };
		int Value = arrayRotateCheck(arr);
		System.out.println(Value);
	}

}
