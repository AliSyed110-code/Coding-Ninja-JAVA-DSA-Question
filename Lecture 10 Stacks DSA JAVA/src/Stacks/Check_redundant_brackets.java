package Stacks;

import java.util.Stack;

public class Check_redundant_brackets {

	public static boolean checkRedundantBrackets(String expression) {

		Stack<Character> Stack = new Stack<Character>();
		int count = 0;
		for (int j = 0; j < expression.length(); j++) {

			char i = expression.charAt(j);

			if (i == ')') {
				count = 0;
				while (Stack.peek() != '(') {
					Stack.pop();
					count++;
				} 
				Stack.pop();
				if (count <= 1)
					return true;
			} else
				Stack.push(i);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
