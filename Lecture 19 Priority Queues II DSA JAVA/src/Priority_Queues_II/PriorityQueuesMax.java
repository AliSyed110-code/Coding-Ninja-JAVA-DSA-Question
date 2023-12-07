package Priority_Queues_II;

import java.util.ArrayList;

public class PriorityQueuesMax {

	ArrayList<Integer> heap;

	// Complete this class
	// Max heap

	public PriorityQueuesMax() {
		this.heap = new ArrayList<>();
	}

	boolean isEmpty() {
		// Implement the isEmpty() function here
		return heap.isEmpty();
	}

	int getSize() {
		// Implement the getSize() function here
		return heap.size();
	}

	int getMax() {
		// Implement the getMax() function here
		if (heap.isEmpty()) {
			return -Integer.MAX_VALUE;
		}
		return heap.get(0);
	}

	void insert(int element) {
		// Implement the insert() function here
		heap.add(element);
		int index = heap.size() - 1;
		int parentIndex = (index - 1) / 2;
		while (index > 0 && heap.get(index) > heap.get(parentIndex)) {
			swap(index, parentIndex);
			index = parentIndex;
			parentIndex = (index - 1) / 2;
		}
	}

	void swap(int index1, int index2) {
		// Implement the swap() function here
		int temp = heap.get(index1);
		heap.set(index1, heap.get(index2));
		heap.set(index2, temp);
	}

	int removeMax() {
		if (getSize() == 0)
			return Integer.MIN_VALUE;
		int removedElement = heap.get(0);
		int last = heap.get(heap.size() - 1);
		heap.set(0, last);
		heap.remove(heap.size() - 1);
		int parentIndex = 0, childIndex1 = 1, childIndex2 = 2;
		while (childIndex2 < getSize()
				&& (heap.get(parentIndex) < heap.get(childIndex1) || heap.get(parentIndex) < heap.get(childIndex2))) {
			int maxIndex;
			if (heap.get(childIndex1) > heap.get(childIndex2))
				maxIndex = childIndex1;
			else
				maxIndex = childIndex2;
			int temp = heap.get(parentIndex);
			heap.set(parentIndex, heap.get(maxIndex));
			heap.set(maxIndex, temp);
			parentIndex = maxIndex;
			childIndex1 = parentIndex * 2 + 1;
			childIndex2 = childIndex1 + 1;
		}
		return removedElement;
	}
}
