package Linked_Lists;

public class Eliminate_duplicates_from_LL {

	public static Node<Integer> removeDuplicates(Node<Integer> head) {

		if (head == null || head.next == null) {
			return head;
		}

		Node<Integer> uniqueNode = head.next, node = head;

		while (uniqueNode != null) {

			if (!(uniqueNode.data).equals(node.data)) {

				node.next = uniqueNode;
				node = node.next;
			}
			uniqueNode = uniqueNode.next;

		}
		node.next = uniqueNode;

		return head;

	}

	public static void main(String[] args) {

	}

}
