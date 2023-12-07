package Linked_Lists;

public class Find_a_Node_in_Linked_List {

	public static int findNode(Node<Integer> head, int n) {

		Node<Integer> newhead = head;
		int count = 0;
		while (newhead != null) {

			if (newhead.data == n) {
				return count;
			} else {
				newhead = newhead.next;
				count++;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

	}

}
