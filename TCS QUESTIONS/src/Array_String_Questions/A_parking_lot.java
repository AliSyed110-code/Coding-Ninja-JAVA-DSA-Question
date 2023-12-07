package Array_String_Questions;

import java.util.Scanner;

public class A_parking_lot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int Park[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				Park[i][j] = s.nextInt();
			}
		}
		int maxsum = 0;
		int ans = 0;
		for (int i = 0; i < row; i++) {
			int sum = 0;
			for (int j = 0; j < col; j++) {
				sum = sum + Park[i][j];
			}
			if (sum > maxsum) {
				maxsum = sum;
				ans = i + 1;
			}
		}
		System.out.println(ans);
	}
}
