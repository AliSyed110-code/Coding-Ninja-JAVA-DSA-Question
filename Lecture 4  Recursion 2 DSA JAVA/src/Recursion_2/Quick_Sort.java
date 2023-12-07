package Recursion_2;

public class Quick_Sort {

	public class Solution {

		public static void quickSort(int[] input) {
			solve(input, 0, input.length - 1);

		}

		public static void solve(int[] a, int low, int high) {
			if (low > high) {
				return;
			}
			int s = low;
			int e = high;
			int m = s + (e - s) / 2;
			int pi = a[m];
			while (s <= e) {

				while (s <= e && a[s] < pi) {
					s++;
				}
				while (s <= e && a[e] > pi) {
					e--;
				}
				if (s <= e) {
					int t = a[s];
					a[s] = a[e];
					a[e] = t;
					s++;
					e--;

				}

			}
			solve(a, low, e);
			solve(a, s, high);
		}
	}

	public static void main(String[] args) {

		int arr[] = {5,2,8,9,1};
		 quickSort(arr, 0, arr.length - 1);
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i] +  " ");
	}

}
