package Assignment;

import java.util.Arrays;

public class Array_Intersection {

	public static void intersection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int n = arr1.length;
		int m = arr2.length;
		int i = 0;
		int j = 0;
		while (i < n && j < m) {
			if (arr1[i] == arr2[j]) {
				System.out.println(arr1[i] + " ");
				i++;
				j++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else {
				j++;
			}
		}

	}

	public static void main(String[] args) {

		int arr1[] = { 2, 6, 1, 2 };
		int arr2[] = { 1, 2, 3, 4, 2 };
		intersection(arr1, arr2);

	}

}
