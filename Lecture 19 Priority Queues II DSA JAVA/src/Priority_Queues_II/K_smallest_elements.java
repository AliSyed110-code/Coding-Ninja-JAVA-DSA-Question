package Priority_Queues_II;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_smallest_elements {

	public static ArrayList<Integer> kSmallest(int n, int[] input, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		ArrayList<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			pq.add(input[i]);
		}
		for (int i = 0; i < k; i++) {
			res.add(pq.poll());
		}
		return res;
	}

	public static void main(String[] args) {
		int arr[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 8, 6 };
		System.out.println(kSmallest(4, arr, 5));
	}

}
