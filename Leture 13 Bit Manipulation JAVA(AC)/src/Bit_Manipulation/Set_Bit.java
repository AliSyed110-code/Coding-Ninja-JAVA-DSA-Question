package Bit_Manipulation;

public class Set_Bit {

	public static int setIthBit(int n, int i) {
		int BitMask = 1 << i;
		return n | BitMask;
	}

	public static void main(String[] args) {

		System.out.println(setIthBit(10, 2));

	}
}
