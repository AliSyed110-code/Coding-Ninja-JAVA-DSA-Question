
public class Remove_leaf_nodes_in_Tree {

	public static TreeNode<Integer> removeLeafNodes(TreeNode<Integer> root) {

		if (root == null) {
			return null;
		}
		if (root.children.size() == 0) {
			return null;
		}
		for (int i = 0; i < root.children.size(); i++) {

			TreeNode<Integer> child = root.children.get(i);

			if (child.children.size() == 0) {
				for (int j = i; j < root.children.size() - 1; j++)

					root.children.set(j, root.children.get(j + 1));
				root.children.remove(root.children.size() - 1);

				i--;
			}
		}
		for (int i = 0; i < root.children.size(); i++) {

			root.children.set(i, removeLeafNodes(root.children.get(i)));
		}
		return root;
	}

	public static void printTheTree(TreeNode<Integer> root) {

		if (root == null)
			return;

		System.out.print(root.data + " :");

		for (int i = 0; i < root.children.size(); i++)
			System.out.print(root.children.get(i).data + " ");

		System.out.println();

		for (int i = 0; i < root.children.size(); i++)
			printTheTree(root.children.get(i));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
