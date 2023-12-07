package Priority_Queues_II;

import java.util.Collections;
import java.util.PriorityQueue;

public class RunningMedian {

	public static void findMedian(int arr[]) {

		PriorityQueue<Integer> max = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> min = new PriorityQueue<>();
		int i = 0;

		while (i < arr.length) {
			if (min.size() == 0) {
				max.add(arr[i]);
				i++;
				if (max.size() == 2) {
					min.add(max.remove());
					int j = (min.element() + max.element()) / 2;
					System.out.println(j + " ");
					continue;
				}
				System.out.println(max.element() + " ");
				continue;
			} else if (arr[i] > max.element()) {
				min.add(arr[i]);
				i++;
			} else {
				max.add(arr[i]);
				i++;
			}
			if (max.size() - min.size() == 2) {
				min.add(max.remove());
			}
			if (min.size() - min.size() == 2) {
				max.add(min.remove());
			}
			if (min.size() == max.size()) {
				int j = (min.element() + max.element()) / 2;
				System.out.println(j + " ");
			}
			if (min.size() - max.size() == 1) {
				System.out.println(min.element() + " ");
			}
			if (max.size() - min.size() == 1) {
				System.out.println(max.element() + " ");
			}
		}
	}

	public static void main(String[] args) {

	}
}
