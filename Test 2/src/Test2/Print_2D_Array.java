package Test2;

public class Print_2D_Array {

	public static void print2DArray(int input[][]) {

		for (int i = 0; i <  input.length; i++) {
			int count =  input.length - i;
			while (count > 0) {
				for (int j = 0; j < input[0].length; j++) {
					System.out.print(input[i][j] + " ");
				}
				count--;
				System.out.println("");

			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
