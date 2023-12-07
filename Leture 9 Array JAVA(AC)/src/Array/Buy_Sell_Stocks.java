package Array;

public class Buy_Sell_Stocks {

	public static int BuySell(int Selling[]) {
		int buyPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		for (int i = 0; i < Selling.length; i++) {
			if (Selling[i] > buyPrice) {
				int profit = Selling[i] - buyPrice;
				maxProfit = Math.max(maxProfit, profit);
			} else {
				buyPrice = Selling[i];
			}
		}
		return maxProfit;
	}

	public static void main(String[] args) {

		int price[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(BuySell(price));
	}

}
