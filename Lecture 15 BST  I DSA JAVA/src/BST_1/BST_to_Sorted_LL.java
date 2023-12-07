package BST_1;

public class BST_to_Sorted_LL {

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if (root == null)
			return null;
		LinkedListNode<Integer> head;
		LinkedListNode<Integer> newNode = new LinkedListNode<Integer>(root.data);
		LinkedListNode<Integer> lh = constructLinkedList(root.left);
		LinkedListNode<Integer> rh = constructLinkedList(root.right);

		if (lh != null) {
			head = lh;
			LinkedListNode<Integer> tail = head;

			while (tail.next != null) {
				tail = tail.next;
			}
			tail.next = newNode;

		} else {
			head = newNode;

		}
		newNode = rh;
		return head;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
