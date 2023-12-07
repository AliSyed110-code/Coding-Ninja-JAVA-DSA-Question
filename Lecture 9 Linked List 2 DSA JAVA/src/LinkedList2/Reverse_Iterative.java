package LinkedList2;

public class Reverse_Iterative {

	public static Node<Integer> reverse(Node<Integer> head) {

		Node<Integer> curr = head;
		Node<Integer> prev = null;
		Node<Integer> temp;

		while (curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		return prev;
	}

	public static void main(String[] args) {

	}

}
