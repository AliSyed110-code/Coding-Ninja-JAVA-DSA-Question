package Binary_Trees;

public class MinimumMaximumBinaryTree {

	public static pair1<Integer, Integer> getMinAndMax(BinaryTreeNode<Integer> root) {
		if (root == null) {
			pair1<Integer, Integer> output = new pair1<Integer, Integer>(Integer.MAX_VALUE, Integer.MIN_VALUE);
			return output;
		}

		pair1<Integer, Integer> Left = getMinAndMax(root.left);
		pair1<Integer, Integer> Right = getMinAndMax(root.right);

		int max = Math.max(Left.maximum, Right.maximum);
		int min = Math.min(Left.minimum, Right.minimum);

		max = Math.max(root.data, max);
		min = Math.min(root.data, min);

		pair1<Integer, Integer> output = new pair1<Integer, Integer>(min, max);
		return output;

	}

	public static void main(String[] args) {

	}

}
