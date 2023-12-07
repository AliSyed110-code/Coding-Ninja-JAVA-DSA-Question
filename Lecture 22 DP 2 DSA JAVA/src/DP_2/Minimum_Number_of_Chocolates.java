package DP_2;

public class Minimum_Number_of_Chocolates {

	public static int getMin(int arr[], int N) {

		int dp[] = new int[N];
		dp[0] = 1;
		int count = 0;

		for (int i = 1; i < N; i++) {
			if (arr[i] > arr[i - 1]) {
				dp[i] = 1 + dp[i - 1];
			} else
				dp[i] = 1;
		}

		for (int i = N - 2; i >= 0; i--) {
			if (arr[i] > arr[i + 1] && dp[i] <= dp[i + 1]) {
				dp[i] = 1 + dp[i + 1];
			}
		}

		for (int i = 0; i < dp.length; i++) {
			count = count + dp[i];
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
