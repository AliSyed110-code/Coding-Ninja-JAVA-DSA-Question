package Maps;

import java.util.HashMap;

public class Pair_Sum_to_0 {

	public static int PairSum(int[] input, int size) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < size; i++) {
			if (map.containsKey(input[i])) {
				map.put(input[i], map.get(i));
			} else
				map.put(input[i], 1);
		}
		int pairCount = 0;
		for (int i = 0; i < size; i++) {
			if (map.containsKey(input[i]) && map.containsKey(-1 * input[i])) {
				if (input[i] == -1 * input[i])
					pairCount += map.get(input[i]) * (map.get(input[i]) - 1) / 2;
			} else
				pairCount += map.get(input[i]) * map.get(-1 * input[i]);
			map.remove(input[i]);
			map.remove(-1 * input[i]);
		}
		return pairCount; 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
