package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Total_Sum_on_the_Boundaries_and_Diagonals {

	public static void totalSum(int[][] mat) {
		int N = mat.length;
		if (N == 0) {
			System.out.println("0");
			return;
		}
		int M = mat[0].length;
		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < M; j++) {
				if (i == j || i + j == N - 1) {
					sum += mat[i][j];
				} else if (i == 0 || j == 0 || i == N - 1 || j == M - 1) {
					sum += mat[i][j];
				}
			}
			System.out.println(sum);
		}
	}

	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = s.nextInt();
		System.out.println("Enter number of cols");
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.println("Enter the element at " + i + " row " + j + "column");
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}


	public static void main(String[] args) {
		int arr[][] = takeInput();
		totalSum(arr);
	}

}
