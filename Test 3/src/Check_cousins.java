import java.util.function.BinaryOperator;

public class Check_cousins {

	public static boolean isCousin(BinaryTreeNode<Integer> root, int p, int q) {

		return !issiblings(root, p, q) && level(root, 0, p) == level(root, 0, q);
	}

	public static boolean issiblings(BinaryTreeNode<Integer> root, int node1, int node2) {
		if (root == null) {
			return false;
		}
		if (root.left != null && root.right != null) {

			if (root.left.data == node1 && root.right.data == node2) {
				return true;
			}
		}
		return issiblings(root.left, node1, node2) || issiblings(root.right, node1, node2);
	}

	public static int level(BinaryTreeNode<Integer> root, int k, int node1) {
		if (root == null)
			return -1;
		if (root.data == node1) {
			return k;
		}
		int left = level(root.left, k + 1, node1);
		int right = level(root.right, k + 1, node1);

		if (right == -1) {
			return right;
		}

		if (left == -1) {
			return left;
		}
		return -1;

	}

	public static void main(String[] args) {

	}

}
