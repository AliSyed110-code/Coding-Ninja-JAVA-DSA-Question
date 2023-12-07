package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Print_Like_a_Wave {

	public static void wavePrint(int mat[][]) {
		if (mat.length == 0) {
			System.out.print("");
		}
		int row = mat.length;
		int col = mat[0].length;
		for (int i = 0; i < col; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < row; j++) {
					System.out.print(mat[j][i] + " ");
				}
			} else {
				for (int j = mat.length; j >= 0; j--) {
					System.out.print(mat[j][i] + " ");
				}
				System.out.println();
			}
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
  
		int [][]arr = takeInput();
		wavePrint(arr);	
	}

}
