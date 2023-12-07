
import java.util.Scanner;
import java.util.Stack;

public class ArithmeticExpression {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int q = scanner.nextInt();
		scanner.nextLine(); // Consume the newline character after reading q

		for (int i = 0; i < q; i++) {
			String s = scanner.nextLine();
			if (isFunny(s)) {
				System.out.println("Funny");
			} else {
				System.out.println("Not Funny");
			}
		}
	}

	public static boolean isFunny(String s) {
		String reversed = new StringBuilder(s).reverse().toString();

		for (int i = 1; i < s.length(); i++) {
			int diff1 = Math.abs(s.charAt(i) - s.charAt(i - 1));
			int diff2 = Math.abs(reversed.charAt(i) - reversed.charAt(i - 1));

			if (diff1 != diff2) {
				return false;
			}
		}

		return true;
	}
}
