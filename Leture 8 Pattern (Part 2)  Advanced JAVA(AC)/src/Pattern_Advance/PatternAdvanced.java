package Pattern_Advance;

public class PatternAdvanced {
	public static void main(String[] args) {

		int n = 3;

		// Upper half of the half diamond
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <=  i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}

		// Lower half of the half diamond
		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
	}
}