package Binary_Trees;

public class Print_nodes_at_distance_k_from_node {

	public static int helper(BinaryTreeNode<Integer> root, int node, int k) {
		if (root == null)
			return -1;
		if (root.data == node) {
			depth(root, k);
			return 0;
		}
		int leftdepth = helper(root.left, node, k);
		if (leftdepth != -1) {
			if (leftdepth + 1 == k)
				System.out.println(root.data);
			else
				depth(root.right, k - leftdepth - 2);
			return 1 + leftdepth;
		}
		int rightdepth = helper(root.right, node, k);
		if (rightdepth != -1) {
			if (rightdepth + 1 == k)
				System.out.println(root.data);
			else
				depth(root.left, k - rightdepth - 2);
			return 1 + rightdepth;
		}
		return -1;
	}

	public static void depth(BinaryTreeNode<Integer> root, int k) {
		if (root == null)
			return;
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		depth(root.left, k - 1);
		depth(root.right, k - 1);
	}

	public static void nodesAtDistanceK(BinaryTreeNode<Integer> root, int node, int k) {
		helper(root, node, k);
	}

	public static void main(String[] args) {

	}

}
