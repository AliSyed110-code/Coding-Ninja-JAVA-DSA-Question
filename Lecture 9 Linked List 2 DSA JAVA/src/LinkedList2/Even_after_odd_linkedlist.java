package LinkedList2;

public class Even_after_odd_linkedlist {

	public static Node<Integer> evenAfterOdd(Node<Integer> head) {

		Node<Integer> oddhead = null;
		Node<Integer> oddtail = null;
		Node<Integer> evenhead = null;
		Node<Integer> eventail = null;
		Node<Integer> temp = head;

		while (temp != null) {

			if (temp.data % 2 != 0) {
				if (oddhead == null) {
					oddhead = temp;
					oddtail = temp;
				} else {
					oddtail.next = temp;
					oddtail = oddtail.next;
				}
			} else {
				if (evenhead == null) {
					evenhead = temp;
					eventail = temp;
				} else {
					eventail.next = temp;
					eventail = eventail.next;
				}
			}
			temp = temp.next;
		}

		if (oddhead == null) {
			return evenhead;
		} else {
			oddtail.next = evenhead;
		}
		if (evenhead != null) {
			eventail.next = null;
		}
		return oddhead;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
