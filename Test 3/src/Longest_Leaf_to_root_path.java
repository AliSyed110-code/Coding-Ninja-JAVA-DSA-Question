import java.util.ArrayList;

public class Longest_Leaf_to_root_path {

	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return new ArrayList<Integer>();
		}
		ArrayList<Integer> leftArrayList = longestRootToLeafPath(root.left);
		ArrayList<Integer> rightArrayList = longestRootToLeafPath(root.right);

		if (leftArrayList.size() >= rightArrayList.size()) {
			leftArrayList.add(root.data);
			return leftArrayList;
		} else {
			rightArrayList.add(root.data);
			return rightArrayList;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
