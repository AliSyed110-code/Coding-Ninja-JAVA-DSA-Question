package Recursion_1;

public class Count_Zeros {

	public static int countZerosRec(int input) {
		if (input == 0) {
			return 1;
		}
		return countzero(input);
	}

	public static int countzero(int input) {
		if (input == 0) {
			return 0;
		}
		int count = countzero(input / 10);
		if (input % 10 == 0) {
			count = count + 1;
		}
		return count;
	}

	public static void main(String[] args) {

		int input = 1010;
		System.out.println(countZerosRec(input));
	}

}
