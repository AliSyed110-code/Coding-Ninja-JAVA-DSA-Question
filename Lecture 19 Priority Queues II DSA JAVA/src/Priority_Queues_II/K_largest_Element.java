package Priority_Queues_II;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class K_largest_Element {

	public static int kthLargest(int n, int[] input, int k) {

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int i = 0;
		for (; i < k; i++) {
			pq.add(input[i]);

		}
		for (; i < input.length; i++) {
			int min = pq.element();
			if (min < input[i]) {
				pq.remove();
				pq.add(input[i]);
			}
		}
		return pq.remove();
	}

	public static void main(String[] args) {
		int arr[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 8, 6 };
		System.out.println(kthLargest(0, arr, 2));
	}
}
