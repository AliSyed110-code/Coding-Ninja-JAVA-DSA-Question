
public class Delete_Alternate_Nodes {

	public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;

		while (temp != null && temp.next != null) {
			temp.next = temp.next.next;
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

	}

}
