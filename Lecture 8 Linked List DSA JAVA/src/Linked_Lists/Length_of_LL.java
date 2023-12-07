package Linked_Lists;

public class Length_of_LL {

	public static int length(Node<Integer> head){
		
	 Node<Integer> newhead = head;
	 
	 int count = 0;
	 while(newhead != null) {
		 newhead = newhead.next;
		 count++;
	 }
	 return count;	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
