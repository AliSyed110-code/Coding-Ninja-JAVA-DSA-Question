package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_in_Collections {

	public static void main(String[] args) {

		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		System.out.println(queue.peek());
		System.out.println(queue.size());
		
		
	}
}
