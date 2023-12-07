package Recursion_1;

public class Sum_of_Array {

	public static int sum(int input[]) {
		if (input.length <=1) {
			return input.length;
		}
		int ans = 0;
		for (int i = 0; i < input.length; i++) {
			ans  += input[i];
			
		}
		return ans;
	}

	public static void main(String[] args) {

		int input[] = { 4, 2, 1 };
		System.out.println(sum(input));
	}

}
