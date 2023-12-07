package Pattern_Part_1;

public class Inverted_Rotation_Half_Pyramid_Pattern {

	public static void main(String[] args) {

		int n = 6;
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
