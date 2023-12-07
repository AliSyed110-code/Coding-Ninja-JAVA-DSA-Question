package DP_2;

public class Edit_Distance {

	public static int editDistance(String s1, String s2) {
		if (s1.length() == 0) {
			return s2.length();
		}
		if (s2.length() == 0) {
			return s1.length();
		}

		if (s1.charAt(0) == s2.charAt(0)) {
			return editDistance(s1.substring(1), s2.substring(1));
		} else {
			// insert
			int op1 = editDistance(s1, s2.substring(1));
			// delete
			int op2 = editDistance(s1.substring(1), s2);
			// substitute
			int op3 = editDistance(s1.substring(1), s2.substring(1));

			return 1 + Math.min(op1, Math.min(op2, op3));
		}

	}

	public static int editDistanceM(String s, String t) {
		int m = s.length();
		int n = t.length();

		int storage[][] = new int[m + 1][n + 1];
		for (int i = 0; i <= m; i++) {
			for (int j = 0; j <= n; j++) {
				storage[i][j] = -1;
			}
		}
		return editDistanceM(s, t, storage);

	}

	private static int editDistanceM(String s, String t, int[][] storage) {
		int m = s.length();
		int n = t.length();
		if (storage[m][n] != -1) {
			return storage[m][n];
		}
		if (m == 0) {
			storage[m][n] = n;
			return storage[m][n];
		}
		if (n == 0) {
			storage[m][n] = m;
			return storage[m][n];
		}
		if (s.charAt(0) == t.charAt(0)) {
			return editDistance(s.substring(1), t.substring(1));
		} else {
			// insert
			int op1 = editDistanceM(s, t.substring(1), storage);
			// delete
			int op2 = editDistanceM(s.substring(1), t, storage);
			// substitute
			int op3 = editDistanceM(s.substring(1), t.substring(1), storage);

			storage[m][n] = 1 + Math.min(op1, Math.min(op2, op3));
		}
		return storage[m][n];

	}

	public static int editDistaceDP(String s, String t) {
		int m = s.length();
		int n = t.length();
		int storage[][] = new int[m + 1][n + 1];
		for (int j = 0; j <= n; j++) {
			storage[0][j] = j;
		}
		for (int i = 0; i <= m; i++) {
			storage[i][0] = i;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(m - i) == t.charAt(n - j)) {
					storage[i][j] = storage[i - 1][j - 1];
				} else {
					storage[i][j] = 1 + Math.min(storage[i][j - 1], Math.min(storage[i - 1][j], storage[i - 1][j - 1]));
				}
			}
		}
		return storage[m][n];
	}

	public static void main(String[] args) {
		String s = "adefdfdedfdedfdedfde";
		String t = "fdgbdedefddfdedfdedfdedfdedfde";
		System.out.println(editDistaceDP(s, t));
		System.out.println(editDistanceM(s, t));
		System.out.println(editDistance(s, t));

	}

}
