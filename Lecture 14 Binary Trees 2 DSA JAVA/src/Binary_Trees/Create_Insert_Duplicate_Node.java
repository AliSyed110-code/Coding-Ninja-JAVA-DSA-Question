package Binary_Trees;

public class Create_Insert_Duplicate_Node {

	public static void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		insertDuplicateNode(root.left);
		insertDuplicateNode(root.right);

		BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(root.data);

		BinaryTreeNode<Integer> temp = root.left;
		root.left = newNode;
		newNode.left = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
