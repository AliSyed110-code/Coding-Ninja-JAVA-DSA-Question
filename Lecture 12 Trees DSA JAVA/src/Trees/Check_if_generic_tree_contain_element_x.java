package Trees;

public class Check_if_generic_tree_contain_element_x {

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x) {

		if (root.data == null) {
			return false;
		}
		if (root.data == x) {
			return true;
		}
		for (int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			if (checkIfContainsX(child, x));
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
