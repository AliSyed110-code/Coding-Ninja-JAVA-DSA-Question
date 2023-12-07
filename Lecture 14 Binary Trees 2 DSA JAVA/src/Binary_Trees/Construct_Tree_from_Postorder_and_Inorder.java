package Binary_Trees;

public class Construct_Tree_from_Postorder_and_Inorder {

	public static BinaryTreeNode<Integer> buildTreeHelper(int[] in, int[] pos, int inS, int inE, int posS, int posE) {
		if (inS > inE) {
			return null;
		}
		int rootData = pos[posE];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootInIndex = inS;
		for (; rootInIndex <= inE; rootInIndex++) {
			if (rootData == in[rootInIndex]) {
				break;
			}
		}

		int leftTreeSize = rootInIndex - inS;
		int rightTreeSize = inE - rootInIndex;
		root.left = buildTreeHelper(in, pos, inS, rootInIndex - 1, posS, posS + leftTreeSize - 1);
		root.right = buildTreeHelper(in, pos, rootInIndex + 1, inE, posE - rightTreeSize, posE - 1);
		return root;
	}

	public static BinaryTreeNode<Integer> buildTree(int[] postOrder, int[] inOrder) {
		return buildTreeHelper(inOrder, postOrder, 0, inOrder.length - 1, 0, postOrder.length - 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
