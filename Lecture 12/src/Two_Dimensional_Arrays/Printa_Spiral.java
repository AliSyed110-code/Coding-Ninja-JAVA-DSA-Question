package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Printa_Spiral {

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

	public static void spiralPrint(int matrix[][]) {
		// Your code goes here
		if (matrix.length == 0) {
			System.out.print("");
		} else {
			int rstart = 0, rend = matrix.length - 1, cstart = 0, cend = matrix[0].length - 1;
			int count = matrix.length * matrix[0].length;
			while (count > 0) {
				// System.out.println("Left to right");
				for (int i = cstart; i <= cend && count > 0; i++) {
					System.out.print(matrix[rstart][i] + " ");
					count--;
				}
				rstart++;

				// System.out.println("");
				// System.out.println("Top to bottom");
				for (int i = rstart; i <= rend && count > 0; i++) {
					System.out.print(matrix[i][cend] + " ");
					count--;
				}

				cend--;

				// System.out.println("");
				// System.out.println("Right to left");
				for (int i = cend; i >= cstart && count > 0; i--) {
					System.out.print(matrix[rend][i] + " ");
					count--;
				}
				rend--;

				// System.out.println("");
				// System.out.println("Bottom to top");
				for (int i = rend; i >= rstart && count > 0; i--) {
					System.out.print(matrix[i][cstart] + " ");
					count--;
				}
				// System.out.println("");

				cstart++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[][] = takeInput();
		spiralPrint(arr);

	}

}
