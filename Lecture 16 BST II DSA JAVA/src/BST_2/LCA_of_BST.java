package BST_2;

public class LCA_of_BST {

	public static int getLCA(BinaryTreeNode<Integer> root, int a, int b) {
		if (root == null) {
			return -1;
		}
		if (a < root.data && b < root.data) {
			return getLCA(root.left, a, b);
		}
		if (a > root.data && b > root.data) {
			return getLCA(root.right, a, b);
		}
		if (root.data == a || root.data == b) {
			return root.data;
		}
		int LeftLca = getLCA(root.left, a, b);
		int rightLca = getLCA(root.right, a, b);

		if (LeftLca == -1 && rightLca == -1) {
			return -1;
		} else if (LeftLca == -1) {
			return rightLca;
		} else if (rightLca == -1) {
			return LeftLca;
		} else {
			return root.data;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
