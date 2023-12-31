package DP_2;

public class Maximum_Square_Matrix_With_All_Zeros {

	public static int findMaxSquareWithAllZeros(int[][] input) {

		if (input.length == 0)
			return 0;
		int n = input.length;
		int m = input[0].length;

		int[][] dp = new int[n][m];
		int max = 0;
		dp[0][0] = (input[0][0] == 0 ? 1 : 0);

		for (int i = 0; i < n; i++)
			dp[i][0] = (input[i][0] == 0 ? 1 : 0);
		for (int i = 0; i < m; i++)
			dp[0][i] = (input[0][i] == 0 ? 1 : 0);

		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				if (input[i][j] == 1)
					dp[i][j] = 0;
				else {
					dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
				}
				max = Math.max(dp[i][j], max);
			}
		}
		return max;
	}

	public static void main(String[] args) {

		int input[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 0 } };
		System.out.println(findMaxSquareWithAllZeros(input));
	}

}
