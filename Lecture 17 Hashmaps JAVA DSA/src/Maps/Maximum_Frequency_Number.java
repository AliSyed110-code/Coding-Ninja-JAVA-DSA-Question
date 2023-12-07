package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Maximum_Frequency_Number {

	public static int maxFrequencyNumber(int[] arr) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		int maxFre = 0;
		int max = Integer.MIN_VALUE;

		for (int i : arr) {
			if (maxFre < map.get(i)) {
				maxFre = map.get(i);
				max = i;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 4, 5, 5, 7, 5, 9,4,4,4 };

		System.out.println(maxFrequencyNumber(arr));

	}
}
