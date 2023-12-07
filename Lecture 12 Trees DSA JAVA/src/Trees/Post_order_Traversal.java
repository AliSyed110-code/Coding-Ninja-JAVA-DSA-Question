package Trees;

public class Post_order_Traversal {

	public static void printPostOrder(TreeNode<Integer> root) {

		if (root.children.size() == 0) {
			System.out.print(root.data + " ");
			return;
		}
		for (TreeNode<Integer> child : root.children) {
			printPostOrder(child);
		}
		System.out.print(root.data+ " ");
	}

	public static void main(String[] args) {

	}

}
