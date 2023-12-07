package LinkedList2;

public class Delete_Recursively {

	public static Node<Integer> deleteNodeRec(Node<Integer> head, int pos) {
		if (pos == 0 && head != null) {
			return head.next;
		} else if (pos == 0 && head == null) {
			return null;
		}
		if (head == null) {
			return head;
		}

		head.next = deleteNodeRec(head.next, pos - 1);
		return head;
	}

	public static void main(String[] args) {

	}

}
