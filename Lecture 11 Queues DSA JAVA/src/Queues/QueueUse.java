package Queues;

public class QueueUse {

	public static void main(String[] args) {
//		QueuesUsingArray queue = new QueuesUsingArray(3);
		QueueUsingLL<Integer> queue = new QueueUsingLL<>();
		for (int i = 1; i <= 5; i++) {
			queue.enqueue(i);
		}
		while (!queue.isEmpty()) {
			try {
				System.out.println(queue.dequeue());
			} catch (QueuesEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
