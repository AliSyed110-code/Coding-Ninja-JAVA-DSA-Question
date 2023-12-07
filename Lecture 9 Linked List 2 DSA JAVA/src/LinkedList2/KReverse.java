package LinkedList2;

public class KReverse {

	public static Node<Integer> reverseLinkedListRec(Node<Integer> head) {
		if (head == null || head.next == null) {

			return head;
		}
		Node<Integer> smallerHead = reverseLinkedListRec(head.next);
		Node<Integer> node = smallerHead;
		while (node.next != null) {
			node = node.next;
		}
		node.next = head;
		head.next = null;
		return smallerHead;
	}

	public static Node<Integer> findTail(Node<Integer> head, int k) {
		for (int i = 0; i < k && head.next != null; i++) {
			head = head.next;
		}
		return head;
	}

	public static int findLength(Node<Integer> head) {
		int count = 0;
		while (head.next != null) {
			head = head.next;
			count = count + 1;
		}
		return count;
	}

	public static Node<Integer> kReverse(Node<Integer> head, int k) {

		if (head == null || k == 0 || k == 1) {
			return head;
		} else if (k > findLength(head)) {

			return reverseLinkedListRec(head);

		}

		Node<Integer> node = head, nextNode = null, tail = null, prevTail = null, newHead = null;
		while (node != null) {
			tail = findTail(node, k - 1);
			nextNode = tail.next;
			tail.next = null;
			newHead = reverseLinkedListRec(node);
			if (node == head) {
				tail = head;
				tail.next = nextNode;
				head = newHead;
			} else {
				tail = node;
				tail.next = nextNode;
				prevTail.next = newHead;
			}
			node = nextNode;
			prevTail = tail;

		}
		return head;
	}

	public static void main(String[] args) {

	}

}
