package LinkedList2;

public class Swap_two_Nodes_of_LL {

	public static Node<Integer> swapNodes(Node<Integer> head, int i, int j) {
		if (i == j) {
			return head;
		}
		if (i > j) {
			int t = i;
			i = j;
			j = t;
		}
		Node<Integer> p1 = null, p2 = null, c1 = null, c2 = null;
		Node<Integer> temp = head;
		Node<Integer> tail = null;
		int count = 0;
		while (temp != null) {
			if (count == i) {
				p1 = tail;
				c1 = temp;
			} else if (count == j) {
				p2 = tail;
				c2 = temp;
			}
			tail = temp;
			temp = temp.next;
			count++;
		}
		if(p1 == null) {
			head = c2;
			
		}
		else {
			p1.next = c2;
			p2.next = c1;
		}
		Node<Integer> nextelem = c2.next;
		c2.next = c1.next;
		c1.next = nextelem;
		
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
