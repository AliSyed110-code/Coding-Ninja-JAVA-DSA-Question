package Queues;

import java.util.Queue;

public class Reverse_Queue {

	public static void reverseQueue(Queue<Integer> input) {

		if (input.size() == 0 || input.size() == 1) {
			return;
		}

		int temp = input.remove();
		reverseQueue(input);
		input.add(temp);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
