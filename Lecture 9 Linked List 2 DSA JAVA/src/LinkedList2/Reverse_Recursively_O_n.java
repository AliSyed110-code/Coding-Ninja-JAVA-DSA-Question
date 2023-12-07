package LinkedList2;

public class Reverse_Recursively_O_n {

	public static Node<Integer> reverseLLR(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}
		Node<Integer> reversedTail = head.next;
		Node<Integer> smallHead = reverseLLR(head.next);
		reversedTail.next = head;
		head.next = null;

		return smallHead;
	}

	public static void main(String[] args) {

	}

}
