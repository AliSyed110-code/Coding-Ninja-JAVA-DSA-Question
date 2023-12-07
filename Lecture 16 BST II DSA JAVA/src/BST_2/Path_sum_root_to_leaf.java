package BST_2;

public class Path_sum_root_to_leaf {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

		rootToLeafPathsSumToK(root, k, "");

	}

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k, String arr) {

		if (root == null) {
			return;
		}

		int rootData = root.data;
		arr = arr + rootData + " ";
		if (k == rootData && root.left == null && root.right == null) {
			System.out.println(arr);
			return;
		}

		rootToLeafPathsSumToK(root.left, k - root.data, arr + " ");
		rootToLeafPathsSumToK(root.right, k - root.data, arr + " ");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
