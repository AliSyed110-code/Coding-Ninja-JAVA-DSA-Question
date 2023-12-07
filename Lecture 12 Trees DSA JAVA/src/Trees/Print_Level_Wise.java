package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Print_Level_Wise {

	public static void printLevelWise(TreeNode<Integer> root) {

		Queue<TreeNode<Integer>> q = new LinkedList<TreeNode<Integer>>();
		q.add(root);
		q.add(null);
		while (!q.isEmpty()) {
			TreeNode<Integer> front = q.poll();
			if (front == null) {
				if (q.isEmpty()) {
					return;
				} else {
					q.add(null);
					System.out.println();
					continue;
				}
			}
			System.out.println(front.data + " ");
			for (int i = 0; i < front.children.size(); i++) {
				q.add(front.children.get(i));
			}
		}
	}

	public static void main(String[] args) {

	}

}
