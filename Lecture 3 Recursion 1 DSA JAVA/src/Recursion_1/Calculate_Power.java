package Recursion_1;

public class Calculate_Power {

	public static int power(int b , int p) {
		if(p==0) {
			return 1;
		}
		int SmallOutput = power(b, (p - 1));
		int ans = b*SmallOutput;
		return ans;
	}

	
	public static void main(String[] args) {
		int base = 3;
		int power = 4;
		System.out.println(power(base, power));
	}

}
