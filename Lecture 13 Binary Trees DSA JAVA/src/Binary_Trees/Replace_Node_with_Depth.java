package Binary_Trees;

public class Replace_Node_with_Depth {

	public static void changeToDepthTree(BinaryTreeNode<Integer> root) {

		changeToDepthTree(root, 0);

	}

	public static void changeToDepthTree(BinaryTreeNode<Integer> root, int depth) {
		if (root == null) {
			return;
		}
		root.data = depth;
		changeToDepthTree(root.left, depth + 1);
		changeToDepthTree(root.right, depth + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
