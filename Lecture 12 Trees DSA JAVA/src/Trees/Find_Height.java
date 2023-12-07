package Trees;

public class Find_Height {

	public static int getHeight(TreeNode<Integer> root) {

		if (root == null) {
			return 1;
		}
		int count = 0;
		for (int i = 0; i < root.children.size(); i++) {
			count = Math.max(getHeight(root.children.get(i)), count);
		}
		return count + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
