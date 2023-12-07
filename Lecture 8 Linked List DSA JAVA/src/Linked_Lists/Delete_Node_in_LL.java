package Linked_Lists;

import java.util.Scanner;

public class Delete_Node_in_LL {

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

	public static void print(Node<Integer> head) {

		while (head != null) {
			System.out.print(head.data + " ");

			head = head.next;
		}

		System.out.println();
	}

	public static Node<Integer> deleteNode(Node<Integer> head, int pos) {

		if (head == null) {
			return head;
		}
		if (pos == 0) {
			return head.next;
		}

		int count = 0;
		Node<Integer> currhead = head;
		while (currhead != null && count < (pos - 1)) {
			currhead = currhead.next;
			count++;
		}
		if (currhead == null || currhead.next == null) {
			return head;
		}
		currhead.next = currhead.next.next;
		return head;

	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		head = deleteNode(head, 3);
		print(head);

	}

}
