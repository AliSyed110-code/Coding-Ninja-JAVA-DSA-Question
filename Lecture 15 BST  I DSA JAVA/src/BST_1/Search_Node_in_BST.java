package BST_1;

public class Search_Node_in_BST {

	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return false;
		}
		int rootData = root.data;
		if (k < rootData) {
			return searchInBST(root.left, k);
		} else if (k > rootData) {
			return searchInBST(root.right, k);
		} else {
			return true;
		}

	}

	public static void main(String[] args) {

		
	}

}
