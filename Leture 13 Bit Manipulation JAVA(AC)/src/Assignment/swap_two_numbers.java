package Assignment;

public class swap_two_numbers {

	public static void main(String[] args) {
		int x = 3, y = 4;
		System.out.println("Before swap: x = " + x + " and y = " + y);

		// swap using XOR

		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println("Afterswap: x = " + x + " and y = " + y);
	}
}
