package Pattern_Advance;

public class Inverted_Rotation_Half_Pyramid_Pattern {

	public static void Half_Pyramid_Pattern(int n) {

		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		int n = 6;
		Half_Pyramid_Pattern(n);
}

}
