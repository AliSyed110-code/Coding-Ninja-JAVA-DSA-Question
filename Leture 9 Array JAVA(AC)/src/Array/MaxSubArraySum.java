package Array;

public class MaxSubArraySum {

	public static int PrintSubarrays(int input[]) {

		int sum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				sum = 0;
				for (int k = i; k <= j; k++) {
					sum += input[k];
				}
				System.out.println(sum);
				if (max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int input[] = { 1, -2, 6, -1, 3 };
		System.out.println("MaxSum : " + PrintSubarrays(input));

	}

}
