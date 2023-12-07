package Priority_Queues_II;

import java.util.PriorityQueue;

public class K_largest_Elements_Code {

	public static void printKLargest(int arr[], int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		int i = 0;
		for (; i < k; i++) {
			pq.add(arr[i]);
		}
		for (; i < arr.length; i++) {
			int min = pq.element();
			if (min < arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		while (!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 12, 9, 16, 10, 5, 3, 20, 25, 11, 8, 6 };
		printKLargest(arr, 2);
	}

}
