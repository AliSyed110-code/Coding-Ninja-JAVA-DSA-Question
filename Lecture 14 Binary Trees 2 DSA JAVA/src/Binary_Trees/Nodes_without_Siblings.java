package Binary_Trees;

public class Nodes_without_Siblings {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
		if (root.left == null) {
			System.out.print(root.right.data + " ");
			printNodesWithoutSibling(root.right);
		} else if (root.right == null) {
			System.out.print(root.left.data + " ");
			printNodesWithoutSibling(root.left);
		} else {
			printNodesWithoutSibling(root.left);
			printNodesWithoutSibling(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
