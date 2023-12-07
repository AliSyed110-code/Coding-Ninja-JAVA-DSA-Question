package Trees;

public class Number_of_nodes_greater_than_x {

	static int count;

	public static int numNodeGreater(TreeNode<Integer> root, int x) {

		if (root.data > x) {
			return count++;
		}

		for (TreeNode<Integer> child : root.children) {
			numNodeGreater(child, x);
		}
		return count;
	}

	public static void main(String[] args) {

	}

}
