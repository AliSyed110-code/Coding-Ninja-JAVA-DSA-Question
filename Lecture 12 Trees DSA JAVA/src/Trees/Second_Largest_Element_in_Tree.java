package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class Second_Largest_Element_in_Tree {

	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root) {

		if (root.children.size() == 0) {
			return null;
		}
		Queue<TreeNode<Integer>> queue = new LinkedList<>();
		TreeNode<Integer> f1 = root, s1 = null;
		int data = 0;
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode<Integer> frontNode = queue.poll();
			for (int i = 0; i < frontNode.children.size(); i++) {
				queue.add(frontNode.children.get(i));
			}
			if(frontNode.data > data) {
				if(frontNode.data > f1.data) {
					s1 = f1;
					data = f1.data;
					f1 = frontNode;
				}
				else if(frontNode.data < f1.data) {
					s1 = frontNode;
					data = s1.data;
				}
			}
		}
		return s1; 
	}

	public static void main(String[] args) {

	}

}
