package LinkedList2;

public class Print_Recursive {

	public static void printR (Node<Integer> head) {
		if(head == null) {
			return ;
		}
//		System.out.print(head.data + " ");
		printR(head.next);
		System.out.print(head.data + " ");
	}
	
	public static void main(String[] args) {
		
		

	}

}
