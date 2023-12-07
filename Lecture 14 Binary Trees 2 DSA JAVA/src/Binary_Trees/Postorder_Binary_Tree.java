package Binary_Trees;

public class Postorder_Binary_Tree {

	public static void postOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
