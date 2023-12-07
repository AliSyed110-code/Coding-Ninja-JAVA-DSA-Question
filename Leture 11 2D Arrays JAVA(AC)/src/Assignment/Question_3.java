package Assignment;

public class Question_3 {

	public static void PrintTranspose(int input[][]) {
		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input[0].length; j++) {
				System.out.print(input[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		int row = 2, column = 3;
		int[][] input = { { 2, 3, 7 }, { 5, 6, 7 } };

		// Display original matrix
		PrintTranspose(input);
		
		System.out.println();

		// Transpose the matrix
		int[][] transpose = new int[column][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				transpose[j][i] = input[i][j];
			}
		}
		PrintTranspose(transpose);
	}

}
