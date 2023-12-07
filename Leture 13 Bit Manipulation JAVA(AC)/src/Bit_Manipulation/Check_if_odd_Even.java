package Bit_Manipulation;

public class Check_if_odd_Even {

	public static void oddOrEven(int n) {
		int bitMask = 1;
		if ((n & bitMask) == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}

	public static void main(String[] args) {

		oddOrEven(3);
		oddOrEven(7);
		oddOrEven(9);
		oddOrEven(14);
	}
}
