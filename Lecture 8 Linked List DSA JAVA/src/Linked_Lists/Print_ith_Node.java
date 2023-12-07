package Linked_Lists;
import java.util.LinkedList;
import java.util.Scanner;

public class Print_ith_Node {

	public static Node<Integer> takeInput() {

		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();

		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode; // tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void printIthNode(Node<Integer> head, int i) {

		if (head == null) {
			return;
			// System.out.println(0);
		}
		int count = 0;
		while (count < i) {
			if (head.data == null) {
				return;
			}
			count++;
			head = head.next;
			// to check out of bout condition

		}
		System.out.println(head.data);

	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();

		printIthNode(head, 2);

	}

}
