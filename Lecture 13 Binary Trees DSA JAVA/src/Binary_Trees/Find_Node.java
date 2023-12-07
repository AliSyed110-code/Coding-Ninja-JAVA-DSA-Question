package Binary_Trees;

public class Find_Node {

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			return false;
		}
		if (root.data == x) {
			return true;
		}

		return (isNodePresent(root.left, x) || isNodePresent(root.right, x));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
