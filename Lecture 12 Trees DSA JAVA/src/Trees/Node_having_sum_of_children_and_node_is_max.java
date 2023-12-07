package Trees;

public class Node_having_sum_of_children_and_node_is_max {

	public static TreeNode<Integer> node = null;
	static int maxsum;

	public static TreeNode<Integer> maxSumNode(TreeNode<Integer> root) {
		int maxsum = 0;
		max(root);
		return node;
	}

	public static void max(TreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			sum += root.children.get(i).data;
			max(root.children.get(i));
		}
		if (sum > maxsum) {
			maxsum = sum;
			node = root;
		}
		return;
	}

	public static void main(String[] args) {

	}

}
