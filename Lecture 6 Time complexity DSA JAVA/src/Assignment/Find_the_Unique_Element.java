package Assignment;

public class Find_the_Unique_Element {

	public static int findUnique(int[] arr) {

		int val = 0;
		for (int i = 0; i < arr.length; i++) {

			val = val ^ arr[i];

		}
		return val;
	}

	public static void main(String[] args) {

		int arr[] = { 2, 3, 1, 6, 3, 6, 2 };
		System.out.println(findUnique(arr));

	}
}
