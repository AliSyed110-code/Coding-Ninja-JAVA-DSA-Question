package Pattern_Advance;

public class Half_Number_Pyramid {

	public static void NumberPyramid(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {

		int n = 5;
		NumberPyramid(n);

	}

}
