package Functions;

public class isEven {

	public static boolean isEven(int n) {

		if (n % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 1;
		System.out.println(isEven(n));
	}

}
