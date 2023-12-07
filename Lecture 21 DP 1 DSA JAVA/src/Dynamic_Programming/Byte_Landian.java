package Dynamic_Programming;

import java.util.HashMap;

public class Byte_Landian {

	public static long btyelandian(long n, HashMap<Long, Long> memo) {
//		write your code here
		if (n <= 1) {
			return n;
		}
		if (memo.get(n) != null) {
			return memo.get(n);
		}

		long breakDownValue = btyelandian(n / 2, memo) + btyelandian(n / 3, memo) + btyelandian(n / 4, memo);
		memo.put(n, Math.max(n, breakDownValue));

		return memo.get(n);
	}

	public static void main(String[] args) {

	}

}
