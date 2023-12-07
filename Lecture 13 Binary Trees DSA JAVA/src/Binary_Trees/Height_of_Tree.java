package Binary_Trees;

public class Height_of_Tree {

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int smallLeftoutput = height(root.left);
		int smallRightoutput = height(root.right);
		if (smallLeftoutput > smallRightoutput) {
			return smallLeftoutput + 1;
		} else {
			return smallRightoutput + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
