package Stacks;

import java.util.Stack;

public class Balanced_Parenthesis {

	public static boolean isBalanced(String expression) {
		Stack<Character> Stack = new Stack<>();

		for (int j = 0; j < expression.length(); j++) {

			char i = expression.charAt(j);
			if (i == '[' || i == '{' || i == '(') {
				Stack.push(i);
			} else if (i == ']' || i == '}' || i == ')') {
				if (Stack.isEmpty())
					return false;
			} else {
				if (i == ']') {
					if (Stack.peek() != '[') {
						return false;
					} else
						Stack.pop();
				} else if (i == '}') {
					if (Stack.peek() != '{') {
						return false;
					} else
						Stack.pop();
				} else if (i == ')') {
					if (Stack.peek() != '(') {
						return false;
					} else
						Stack.pop();
				}
			}
		}
		return Stack.isEmpty();   
	}

	public static void main(String[] args) {

	}

}
