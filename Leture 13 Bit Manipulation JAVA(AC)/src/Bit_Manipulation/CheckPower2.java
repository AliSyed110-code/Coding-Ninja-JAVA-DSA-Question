package Bit_Manipulation;

public class CheckPower2 {

	public static boolean checkPow2(int n) {
		return (n & (n - 1)) == 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkPow2(16));
	}

}
