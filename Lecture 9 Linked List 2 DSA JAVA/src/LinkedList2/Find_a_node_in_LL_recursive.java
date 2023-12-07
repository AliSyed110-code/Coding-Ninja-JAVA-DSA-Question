package LinkedList2;

public class Find_a_node_in_LL_recursive {

	public static int findNodeRec(Node<Integer> head, int n) {

		if (head == null) {
			return -1;
		}
		if (head.data.equals(n)) {

			return 0;

		}

		int smallIndex = findNodeRec(head.next, n);

		if (smallIndex == -1) {
			return -1;
		} else {
			return smallIndex + 1;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
