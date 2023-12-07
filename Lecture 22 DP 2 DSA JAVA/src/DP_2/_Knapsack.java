package DP_2;

public class _Knapsack {

	public static int knapsackI(int W, int val[], int wt[]) {
		int n = val.length;
		int dp[][] = new int[n + 1][W + 1];

		for (int i = n - 1; i >= 0; i--) {
			for (int w = 0; w <= W; w++) {
				int ans;

				if (wt[i] <= w) {
					int ans1 = val[i] + dp[i + 1][w - wt[i]];
					int ans2 = dp[i + 1][w];
					ans = Math.max(ans1, ans2);
				} else {
					ans = dp[i + 1][w];
				}
				dp[i][w] = ans;

			}
		}
		return dp[0][W];
	}

	public static int knapsack(int[] weights, int[] values, int maxWeight) {
		return knapsack(weights, values, maxWeight, 0);
	}

	private static int knapsack(int[] weights, int[] values, int maxWeight, int i) {
		if (i == weights.length || maxWeight == 0) {
			return 0;
		}
		if (weights[i] > maxWeight) {
			return knapsack(weights, values, maxWeight, i + 1);
		} else {
			// include this ith item
			int op1 = values[i] + knapsack(weights, values, maxWeight - weights[i], i + 1);
			// don't include
			int op2 = knapsack(weights, values, maxWeight, i + 1);
			return Math.max(op1, op2);
		}
	}

	public static void main(String[] args) {

//		int weights[] = { 6, 1, 2, 4, 5 };
//		int values[] = { 10, 5, 4, 8, 6 };
//		int maxWeight = 5;
		int val[] = { 200, 300, 100 };
		int wt[] = { 20, 25, 30 };
		int W = 50;
		int ans = knapsackI(W, val, wt);
		System.out.println(ans);
//		System.out.println(knapsack(weights, values, maxWeight));
	}

}
