package Maps;

import java.util.HashMap;

public class Longest_subset_zero_sum {

	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0, maxLen = -1;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum == 0) {
				maxLen = i + 1;
			}
			if (map.containsKey(sum)) {
				int prevIndex = map.get(sum);
				int currLen = i - prevIndex;
				if (currLen > maxLen) {
					maxLen = currLen;
				}
			} else {
				map.put(sum, i);
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = { 95 ,-97, -387 ,-435, -5, -70, 897, 127, 23, 284};
      System.out.println(lengthOfLongestSubsetWithZeroSum(arr)); 
	}

}
