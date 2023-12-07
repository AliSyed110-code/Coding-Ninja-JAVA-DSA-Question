package Trees;

public class Count_leaf_Nodes {

	public static int countLeafNodes(TreeNode<Integer> root) {

		int leaf = 0;

		if (root.data == null) {
			return 0;
		}
		if (root.children.size() == 0) {
			return 1;
		}
		for (TreeNode<Integer> child : root.children) {

			leaf += countLeafNodes(child);
		}
		return leaf;

	}

	public static void main(String[] args) {

	}

}
