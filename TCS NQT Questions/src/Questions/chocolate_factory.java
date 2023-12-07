package Questions;

import java.util.Scanner;

public class chocolate_factory {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		for (int i = count; i < n; i++) {
			arr[i] = 0;
		}
		
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
