package Dynamic_Programming;

public class Loot_Houses {

	public static int maxMoneyLooted(int[] houses) {

		if (houses.length == 0)
			return 0;

		if (houses.length == 1)
			return houses[0];

		if (houses.length == 2)
			return Math.max(houses[0], houses[1]);

		int n = houses.length;
		int[] dp = new int[n];
		dp[0] = houses[0];
		dp[1] = Math.max(houses[0], houses[1]);

		for (int i = 2; i < n; i++) {
			int maxVal1 = dp[i - 2] + houses[i];

			int maxVal2 = dp[i - 1];

			dp[i] = Math.max(maxVal1, maxVal2);
		}
		return dp[n - 1];
	}

	public static void main(String[] args) {

	}

}
