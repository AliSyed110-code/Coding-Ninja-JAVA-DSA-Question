package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Level_order_traversal {

	public static void printLevelWise(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingNode = new LinkedList<>();
		pendingNode.add(root);
		pendingNode.add(null);
		while (!pendingNode.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = pendingNode.poll();
			if (frontNode == null) {
				if (!pendingNode.isEmpty()) {
					pendingNode.add(null);
				}
				System.out.println();
			} else {
				if (frontNode.left != null) {
					pendingNode.add(frontNode.left);
				}
				if (frontNode.right != null) {
					pendingNode.add(frontNode.right);
				}

				System.out.println(frontNode.data + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
