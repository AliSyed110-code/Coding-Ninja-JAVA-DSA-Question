package Binary_Trees;

public class Node_Greatest_Than_x {

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {

		if (root == null) {
			return 0;
		}
		int smallans = countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);

		if (root.data > x) {
			return smallans + 1;
		} else {
			return smallans;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
