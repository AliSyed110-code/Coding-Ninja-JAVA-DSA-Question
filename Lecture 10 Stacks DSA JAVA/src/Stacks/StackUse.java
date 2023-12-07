package Stacks;

public class StackUse {

	public static void main(String[] args) throws StackFullException {

		StackUsingLL<Integer> Stack =  new StackUsingLL<>();
		
//		StackUsingArray Stack = new StackUsingArray(3);
//
		for (int i = 1; i <= 5; i++) {
			Stack.push(i);
		}

		while (!Stack.isEmpty()) {
			try {
				System.out.println(Stack.pop());
			} catch (Exception e) {
				// Never reach here
			}
		}
	}
}
