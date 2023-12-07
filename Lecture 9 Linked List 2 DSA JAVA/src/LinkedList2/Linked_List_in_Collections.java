package LinkedList2;

import java.util.LinkedList;

public class Linked_List_in_Collections {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.addFirst(40);
		list.addFirst(70);
		list.set(2, 100);
		
		
        System.out.println(list.size());
        
        for(int  i = 0 ;i<list.size();i++) {
        	System.out.println(list.get(i));
        }
	}

}
