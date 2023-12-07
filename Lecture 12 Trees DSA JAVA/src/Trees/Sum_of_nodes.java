package Trees;

public class Sum_of_nodes {

	public static int sumOfAllNode(TreeNode<Integer> root) {

		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			int ans = sumOfAllNode(root.children.get(i));
			sum += ans;
		}
		return sum;
	}

	public static void main(String[] args) {

	}

}
