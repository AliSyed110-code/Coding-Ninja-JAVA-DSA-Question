package Two_Dimensional_Arrays;

import java.util.Scanner;

public class LargestCol_Sum {

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

	
	public static int Largestcolsum(int[][]input) {
		int largest = Integer.MIN_VALUE;
		int row = input.length;
		int col = input[0].length;
		for(int j = 0;j<col;j++) {
			int sum = 0;
			for(int i = 0;i<row;i++) {
				sum = sum+input[i][j];
			}
			if (sum>largest) {
				largest = sum;
			}
		
		}
		return largest;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[][] = takesinput();
      print(arr);
      System.out.println("Largest col sum is " + Largestcolsum(arr));
	}

}
