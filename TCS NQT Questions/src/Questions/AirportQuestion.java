package Questions;

import java.util.Scanner;

public class AirportQuestion {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int arr[] = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int countZero = 0;
		int countOne = 0;
		int countTwo = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZero++;
			} else if (arr[i] == 1) {
				countOne++;
			} else {
				countTwo++;
			}
		}
		for (int i = 0; i < countZero; i++) {
			System.out.print(0 + " ");
		}
		for (int i = 0; i < countOne; i++) {
			System.out.print(1 + " ");
		}
		for (int i = 0; i < countTwo; i++) {
			System.out.print(2 + " ");
		}
	}
}
