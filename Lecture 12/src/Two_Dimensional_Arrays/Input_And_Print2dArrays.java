package Two_Dimensional_Arrays;

import java.util.Scanner;

public class Input_And_Print2dArrays {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the row");
		int row = s.nextInt();
		System.out.println("Enter the column");
		int column = s.nextInt();
		int input[][] = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.println("Enter the element at " + i + " row " + j + " column ");
				input[i][j] = s.nextInt();
			}
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}

	}

}
