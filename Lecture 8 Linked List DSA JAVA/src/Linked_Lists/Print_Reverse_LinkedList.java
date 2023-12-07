package Linked_Lists;

public class Print_Reverse_LinkedList {
	
	public static void printReverse(Node<Integer> root) {
		
		if(root == null) 
			return;
		printReverse(root.next);
		System.out.print(root.data+ " ");
			
		}
	

	public static void main(String[] args) {
		

	}

}
