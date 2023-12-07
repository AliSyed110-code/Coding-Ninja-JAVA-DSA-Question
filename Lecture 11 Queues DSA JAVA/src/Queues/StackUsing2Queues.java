package Queues;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2Queues {

	private Queue<Integer> q1;
	private Queue<Integer> q2;
	private int size;

	public StackUsing2Queues() {
		q1 = new LinkedList<Integer>();
		q2 = new LinkedList<Integer>();
		size = 0;
	}

	public int getsize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void push(int element) {
		q1.add(element);
		size++;
	}

	public int pop() {
		if (q1.isEmpty()) {
			return -1;
		}
		while (q1.size() != 1) {
			q2.add(q1.remove());
		}
		int top = q1.remove();

		while (!q2.isEmpty()) {
			q1.add(q2.remove());
		}
		size--;
		return top;
	}

	public int top() {
		if (q1.isEmpty()) {
			return -1;
		}
		while (q1.size() != 1) {
			q2.add(q1.remove());
		}
		int top = q1.peek();
		q2.add(q1.remove());

		Queue<Integer> q = q1;
		q1 = q2;
		q2 = q;
		return top;
	}

	public static void main(String[] args) {

	}

}
