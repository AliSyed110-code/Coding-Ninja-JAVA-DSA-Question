
public class SpiralMatrix {

	public static void PrintSpiral(int matrix[][]) {
		int startRow = 0;
		int startCol = 0;
		int endRow = matrix.length - 1;
		int endCol = matrix[0].length - 1;

		while (startRow <= endRow && startCol <= endCol) {

			// Top
			for (int j = startCol; j <= endCol; j++) {
				System.out.print(matrix[startRow][j] + " ");
			}
			// Right
			for (int i = startRow + 1; i <= endRow; i++) {
				System.out.print(matrix[i][endCol] + " ");
			}
			// Bottom
			for (int k = endCol - 1; k >= startCol; k--) {
				if (startCol == endCol) {
					break;
				}
				System.out.print(matrix[endRow][k] + " ");
			}
			// Left
			for (int l = endRow - 1; l >= startRow + 1; l--) {
				if (startRow == endRow) {
					break;
				}
				System.out.print(matrix[l][startCol] + " ");
			}
			startCol++;
			startRow++;
			endCol--;
			endRow--;
		}
		System.out.println();
	}

//	public static void Print(int matrix[][]) {
//		for (int i = 0; i < matrix.length; i++) {
//			for (int j = 0; j < matrix[0].length; j++) {
//				System.out.println(matrix[i][j] + " ");
//			}
//		}
//	}

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		PrintSpiral(matrix);
//		Print(matrix);
	}
}
