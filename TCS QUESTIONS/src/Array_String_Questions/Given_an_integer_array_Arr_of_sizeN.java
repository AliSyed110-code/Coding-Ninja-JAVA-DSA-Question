package Array_String_Questions;

import java.util.Scanner;

public class Given_an_integer_array_Arr_of_sizeN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
			if (arr[0] < arr[i]) {
				count++;
			}
		}
		System.out.println(count + 1);
	}
}
