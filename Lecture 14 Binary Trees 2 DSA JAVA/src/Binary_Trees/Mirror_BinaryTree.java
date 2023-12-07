package Binary_Trees;

public class Mirror_BinaryTree {

	public static void mirrorBinaryTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		mirrorBinaryTree(root.left);
		mirrorBinaryTree(root.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
