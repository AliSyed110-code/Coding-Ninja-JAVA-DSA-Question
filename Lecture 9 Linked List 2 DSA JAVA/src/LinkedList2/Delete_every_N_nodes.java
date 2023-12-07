package LinkedList2;

public class Delete_every_N_nodes {

	public static Node<Integer> skipMdeleteN(Node<Integer> head, int M, int N) {

		Node<Integer> NewHead = null;
		Node<Integer> NewTail = null;
		Node<Integer> temp = head;

		int m = M, n = N;
		if (head == null)
			return head;
		if (m == 0)
			return null;
		while (temp != null) {
			while (m > 0 && temp != null) {
				if (NewHead == null) {
					NewHead = temp;
					NewTail = temp;
				} else {
					NewTail.next = temp;
					NewTail = NewTail.next;
				}
				temp = temp.next;
				m--;
			}
			while (n > 0 && temp != null) {

				temp = temp.next;
				n--;
			}

			m = M;
			n = N;
		}
		NewTail.next = null;
		return NewHead;

	}

	public static void main(String[] args) {

	}

}
