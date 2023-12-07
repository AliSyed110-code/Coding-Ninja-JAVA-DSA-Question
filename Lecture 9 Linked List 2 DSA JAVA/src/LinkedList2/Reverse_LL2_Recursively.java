package LinkedList2;

public class Reverse_LL2_Recursively {

	public static DoubleNode1 reverseLLbetter(Node<Integer> head) {
		if (head == null || head.next == null) {
			DoubleNode1 ans = new DoubleNode1();
			ans.head = head;
			ans.tail = head;
			return ans;
		}
		DoubleNode1 smallAns = reverseLLbetter(head.next);
		smallAns.tail.next = head;
		head.next = null;

		DoubleNode1 ans = new DoubleNode1();
		ans.head = smallAns.head;
		ans.tail = head;
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
