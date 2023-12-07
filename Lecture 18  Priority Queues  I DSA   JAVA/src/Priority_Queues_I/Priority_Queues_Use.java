package Priority_Queues_I;

public class Priority_Queues_Use {

	public static void main(String[] args) throws PriorityQueueException {
		// TODO Auto-generated method stub

		Priority_Queue pq = new Priority_Queue();
		int arr[] = { 5, 1, 9, 2, 0 };
		for (int i = 0; i < arr.length; i++) {
             pq.insert(arr[i]);
		}
		while(! pq.isEmpty()) {
			System.out.print(pq.removeMin() + " ");
		}
		System.out.println();
	}

}
