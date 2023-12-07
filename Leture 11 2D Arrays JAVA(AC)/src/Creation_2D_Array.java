import java.util.Scanner;

public class Creation_2D_Array {

	public static boolean search(int arr[][], int key) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] == key) {
					System.out.println("found at cell ( " + i + "," + j + ")");
					return true;
				}
			}
		}
		System.out.println("Key not found");
		return false;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int arr[][] = new int[3][3];
		int row = arr.length;
		int column = arr[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		search(arr, 5);
	}

}
