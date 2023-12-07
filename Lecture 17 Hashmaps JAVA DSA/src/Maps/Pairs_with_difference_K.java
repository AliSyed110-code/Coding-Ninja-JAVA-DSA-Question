package Maps;

import java.util.HashMap;

public class Pairs_with_difference_K {

	public static int getPairsWithDifferenceK(int arr[], int k) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i] + 1));
			} else {
				map.put(arr[i], 1);
			}
		}
		if (k == 0) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = map.get(arr[i]) - 1; j > 0; j--) {
					count += j;
				}
				map.put(arr[i], 0);
			}
		} else {
			for (int i = 0; i < arr.length; i++) {
				if (map.containsKey(arr[i] + k)) {
					count += map.get(arr[i]) * map.get(arr[i] + k);
				}
				if (map.containsKey(arr[i] - k)) {
					count += map.get(arr[i] * map.get(arr[i]) - k);
				}
				map.put(arr[i], 0);
			}
		}
		return count;   
	}

	public static void main(String[] args) {

	}

}
