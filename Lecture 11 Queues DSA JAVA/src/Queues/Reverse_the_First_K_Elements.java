package Queues;

import java.util.Queue;

public class Reverse_the_First_K_Elements {

	public static Queue<Integer> reverseKElements(Queue<Integer> input, int k) {

		if (input.size() > k) {
			k = k % input.size();
		}
		if (k == 0 || k == 1) {
			return input;
		}
		reverseQueue(input, k);

		for (int i = 0; i < input.size() - k; i++) {
			input.add(input.remove());
		}
		return input;
	}

	public static void reverseQueue(Queue<Integer> input, int k) {

		if (input.size() == 0 || input.size() == 1 || k == 0) {
			return;
		}
		int temp = input.remove();
		reverseKElements(input, k - 1);
		input.add(temp);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
