package LinkedList2;
import java.util.Scanner;

import Linked_Lists.Node;

class DoubleNode{

    Node<Integer> head;
    Node<Integer> tail;
    DoubleNode(){

    }

    DoubleNode(Node<Integer> head, Node<Integer> tail){
      this.head= head;
      this.tail= tail;
    }
}


public class Midpoint_of_LinkedList{

  public static void insert(Node<Integer> head, int elem, int pos){
    Node<Integer> nodeToBeInserted= new Node<Integer>(elem);

    if(pos==0){
      nodeToBeInserted.next= head;
      head= nodeToBeInserted;
    }else{
        int count=0;
        Node<Integer> prev= head;
        while(count<pos-1 && prev!=null){
          count++;
          prev=prev.next;
        }
        if(prev!=null){
            nodeToBeInserted.next= prev.next;
            prev.next= nodeToBeInserted;
        }
    }
  }

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

    public static void printR(Node<Integer> head){
      if(head==null){
        return ;
      }
      printR(head.next);
      System.out.print(head.data+" ");
    }

  public static Node<Integer> midpoint(Node<Integer> head){
    Node<Integer> slow= head, fast= head;
    while(fast.next!=null && fast.next.next != null){
      slow= slow.next;
      fast= fast.next.next;
    }
    return slow;
  }
  public static void main(String[] args){

      Node<Integer> head = takeInput();
      Node<Integer> mid= midpoint(head);
      System.out.println(mid.data);

      //Node<Integer> n1= new Node<>(10);
      //System.out.println(length(head));



  }
}
