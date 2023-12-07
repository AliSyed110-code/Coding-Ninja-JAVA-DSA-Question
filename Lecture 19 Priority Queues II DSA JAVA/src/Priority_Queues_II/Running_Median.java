package Priority_Queues_II;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Running_Median {

	public static int buyTicket(int input[], int k) {
		Queue<Integer> queue = new LinkedList<Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < input.length; i++) {
			queue.add(i);
			pq.add(input[i]);
		}
		int time = 0;
		while (!queue.isEmpty()) {
			if (input[queue.peek()] < pq.peek()) {
				queue.add(queue.poll());
			} else {
				int idx = queue.poll();
				pq.remove();
				time++;
				if (idx == k) {
					break;
				}
			}
		}
		return time;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
