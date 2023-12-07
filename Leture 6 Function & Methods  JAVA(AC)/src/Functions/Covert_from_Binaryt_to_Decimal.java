package Functions;

public class Covert_from_Binaryt_to_Decimal {

	public static void convertDec(int n) {
		int pow = 0;
		int dec = 0;

		while (n > 0) {
			int ld = n % 10;
			dec = dec + (ld * (int) Math.pow(2, pow));
			pow++;
			n = n / 10;
		}

		System.out.println(dec);
	}

	public static void main(String[] args) {

		int n = 101;
		convertDec(n);
	}

}
