package LinkedList2;

public class Reverse_LL_Recursive {

	public static Node<Integer> reverseR(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		
		Node<Integer> finalHead = reverseR(head.next);
	    Node<Integer> temp = finalHead;
	    while(temp.next != null) {
	    	temp = temp.next;
	    }
	    temp.next = head;
	    head.next = null;
	   
	    return finalHead;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
