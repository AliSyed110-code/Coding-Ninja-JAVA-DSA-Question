package LinkedList2;

public class Bubble_Sort_Iterative_LinkedList {

	public static int findlengthLL(Node<Integer> head) {

		int count = 0;
		while (head.next != null) {
			head = head.next;
			count++;
		}
		return count;
	}

	public static Node<Integer> bubblesort(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}
		int n = findlengthLL(head);
		Node<Integer> node1 = null, node2 = null;
		int data1 = 0, data2 = 0;
		for (int i = 0; i < n; i++) {
			node1 = head;
			node2 = head.next;
			for (int j = 0; j < n - i; j++) {

 				data1 = node1.data;
				data2 = node2.data;

				if (data1 > data2) {
					node1.data = data2;
					node2.data = data1;
				}
				node1 = node1.next;
				node2 = node2.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {

	}

}
