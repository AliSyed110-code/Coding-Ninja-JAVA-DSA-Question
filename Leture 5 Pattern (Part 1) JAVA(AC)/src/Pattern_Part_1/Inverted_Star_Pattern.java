package Pattern_Part_1;

public class Inverted_Star_Pattern {

	public static void main(String[] args) {

		int n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		 n = 8;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
