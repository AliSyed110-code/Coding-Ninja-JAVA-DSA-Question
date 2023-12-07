package Two_Dimensional_Arrays;

public class Row_Wise_Sum {

	public static void rowWiseSum(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			int sum = 0;
			for (int j = 0; j < mat[0].length; j++) {
				sum = sum + mat[i][j];
			}
			System.out.print(sum + " ");
		}
	}

	public static void main(String[] args) {

		int mat[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 }, { 7, 8 } };
		rowWiseSum(mat);

	}

}
