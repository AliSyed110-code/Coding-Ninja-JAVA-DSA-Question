package BST_2;

public class Largest_BST {

	private static int height(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;

		int lh = height(root.left);
		int rh = height(root.right);
		int ans = Math.max(lh, rh) + 1;
		return ans;
	}

	public static boolean isbst(BinaryTreeNode<Integer> root, int l, int r) {
		if (root == null)
			return true;

		if (root.data < l || root.data > r)
			return false;
		boolean isBst = isbst(root.left, l, root.data - 1) && isbst(root.right, root.data, r);
		return isBst;

	}

	public static int largestBSTSubtree(BinaryTreeNode<Integer> root) {
		if (root == null)
			return 0;

		boolean bst = isbst(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		if (bst == true) {
			return height(root);
		}
		int l = largestBSTSubtree(root.left);
		int r = largestBSTSubtree(root.right);
		return Math.max(l, r);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
