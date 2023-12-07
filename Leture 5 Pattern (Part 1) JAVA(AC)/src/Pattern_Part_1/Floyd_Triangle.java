package Pattern_Part_1;

public class Floyd_Triangle {

	public static void Floyd_Triangle(int n) {

		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(count + " ");
				count++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		Floyd_Triangle(6);

	}

}
