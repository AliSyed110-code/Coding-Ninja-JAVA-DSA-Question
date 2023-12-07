package Two_Dimensional_Arrays;

public class Largest_Row_or_Column {

	public static void findLargest(int mat[][]) {
		if (mat.length == 0) {
			System.out.println("row 0 " + Integer.MAX_VALUE);
			return;
		}
		boolean isRow = true;
		int ans = -1;
		int val = Integer.MAX_VALUE;
		for (int i = 0; i < mat.length; i++) {
			int rowsum = 0;
			for (int j = 0; j < mat[0].length; j++) {
				rowsum = rowsum + mat[i][j];
			}
			if (rowsum > val) {
				val = rowsum;
				ans = i;
			}
		}
		for (int j = 0; j < mat[0].length; j++) {
			int colsum = 0;
			for (int i = 0; i < mat.length; i++) {
				colsum = colsum + mat[j][i];
			}
			if (colsum > val) {
				val = colsum;
				ans = j;
				isRow = false;
			}
		}
		if (isRow) {
			System.out.println("row " + ans + " " + val);
		} else {
			System.out.println("col " + ans + " " + val);
		}
	}

	public static void main(String[] args) {
		int arr[][] = { { 3, 6, 9 }, { 1, 4, 7 }, { 2, 8, 9 } };
		findLargest(arr);
	}
}
