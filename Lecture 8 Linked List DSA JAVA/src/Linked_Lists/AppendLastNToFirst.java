package Linked_Lists;

public class AppendLastNToFirst {

	public static Node<Integer> appendLastNToFirst(Node<Integer> head, int n) {

		if (head == null || n == 0) {
			return head;
		}
		Node<Integer> newNode = head;
		int size = 0;
		while (newNode != null) {
			size++;
			newNode = newNode.next;
		}
		int i = 0;
		Node<Integer> currNode = head;
		Node<Integer> prevNode = head;
		while (i < size - n - 1) {
			currNode = currNode.next;
			i++;
		}
		head = currNode.next;
		currNode.next = null;
		Node<Integer> newhead = head;
		while (newhead.next != null) {
			newhead = newhead.next;
		}
		newhead.next = prevNode;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
