package Maps;

import java.util.ArrayList;
import java.util.HashMap;

public class Longest_Consecutive_Sequence {

	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(null);
		result.add(null);
		HashMap<Integer, Boolean> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], true);
		}
		int maxlength = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) { 
			int length = 1;
			int start = arr[i];
			int end = arr[i];
			if (map.get(arr[i]).equals(true)) {

				int count = 1;
				while (true) {
					if (map.containsKey(arr[i] + count)) {
						map.put(arr[i] + count, false);
						length++;
						end = arr[i] + count;
						count++;
					} else {
						break;
					}
				}
				if (length > maxlength) {
					maxlength = length;
					if (start == end) {
						result.set(0, start);
					} else {
						result.set(0, start);
						result.set(1, end);
					}
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 9, 5, 11, 2, 3, 6, 5, 3, 2 };
        System.out.println(longestConsecutiveIncreasingSequence(arr));
	}

}
