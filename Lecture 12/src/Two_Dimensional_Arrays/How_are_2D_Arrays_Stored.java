package Two_Dimensional_Arrays;

import java.util.Scanner;

public class How_are_2D_Arrays_Stored {

	public static int[][] takesinput() {
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
		return input;
	}

	public static void print(int[][] input) {
		int row = input.length;
		int column = input[0].length;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		int  arr2 [][] = {{1,2,3},{4,5,6}};
//		print(arr2);
//		   System.out.println(arr2);
//		   System.out.println(arr2.length);
//		   for (int i = 0 ;i<2;i++)
//		   System.out.println(arr2[i].length);
		int input[][] = takesinput();
		print(input);

	}

}
