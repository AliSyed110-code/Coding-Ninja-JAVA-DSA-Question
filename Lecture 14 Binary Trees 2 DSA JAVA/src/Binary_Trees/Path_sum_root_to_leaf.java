package Binary_Trees;

import java.util.ArrayList;
import java.util.List;

public class Path_sum_root_to_leaf {

	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {

		List<List<Integer>> ans = new ArrayList<>();

		pathsum(root, k, 0, new ArrayList<>(), ans);

		for (int i = 0; i < ans.size(); i++) {
			for (int j = 0; j < ans.get(i).size(); j++)
				System.out.print(ans.get(i).get(j) + " ");
			System.out.println();

		}
	}

	public static void pathsum(BinaryTreeNode<Integer> root, int k, int sum, List<Integer> temp,
			List<List<Integer>> ans) {
		if (root == null)
			return;
		else if (root.left == null && root.right == null) {
			if (sum + root.data == k) {
				temp.add(root.data);
				ans.add(new ArrayList<Integer>(temp));
				temp.remove(temp.size() - 1);
			}
			return;
		}
		temp.add(root.data);
		pathsum(root.left, k, sum + root.data, temp, ans);
		pathsum(root.right, k, sum + root.data, temp, ans);

		temp.remove(temp.size() - 1);
	}

	public static void main(String[] args) {

	}

}
