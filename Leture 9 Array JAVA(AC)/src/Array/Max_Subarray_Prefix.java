package Array;

public class Max_Subarray_Prefix {

	public static int MaxSumSubarrays(int input[]) {

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int prefix[] = new int[input.length];
		for (int i = 1; i < prefix.length; i++) {
			prefix[i] = prefix[i - 1] + input[i];
		}

		for (int i = 0; i < input.length; i++) {
			int start = i;
			for (int j = i; j < input.length; j++) {
				int end = j;
				sum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
				if (max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int input[] = { 1, -2, 6, -1, 3 };
		System.out.println("MaxSum : " +MaxSumSubarrays(input));

	}

}
