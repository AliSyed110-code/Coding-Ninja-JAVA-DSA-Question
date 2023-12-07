package Assignment;

public class Duplicate_in_array {

	public static int findDuplicate(int[] arr) {

		int add = 0;
		for (int i = 0; i < arr.length; i++) {
			add = add + arr[i];
		}
		int val = (arr.length - 2) * (arr.length - 1) / 2;

		int ans = add - val;

		return ans;
	}

	public static void main(String[] args) {

		int arr[] = {0 ,7, 2, 5, 4, 7, 1, 3, 6};
		System.out.println(findDuplicate(arr));
	}

}
