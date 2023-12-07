package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreesUse {

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		if (root.left == null && root.right == null) {
			return;
		}
		if (root.left == null) {
			System.out.print(root.right.data + " ");
			printNodesWithoutSibling(root.right);
		} else if (root.right == null) {
			System.out.print(root.left.data + " ");
			printNodesWithoutSibling(root.left);
		} else {
			printNodesWithoutSibling(root.left);
			printNodesWithoutSibling(root.right);
		}
	}

	public static void printAtDepthK(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return;
		}
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		printAtDepthK(root.left, k - 1);
		printAtDepthK(root.right, k - 1);
	}

	public static int numLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		if (root.left == null && root.right == null) {
			return 1;
		}
		return numLeaves(root.left) + numLeaves(root.right);
	}

	public static int numberOfNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int rightNodecount = numberOfNodes(root.right);
		int leftNodecount = numberOfNodes(root.left);

		return 1 + leftNodecount + rightNodecount;
	}

	public static int largest(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return -1;
		}
		int largestleft = largest(root.left);
		int largestright = largest(root.right);
		return Math.max(root.data, Math.max(largestleft, largestright));
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {

		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
		queue.add(root);
		while (!queue.isEmpty()) {
			BinaryTreeNode<Integer> Node = queue.poll();
			System.out.println(Node.data + ":");
			if (Node.left != null) {
				System.out.println("L:" + Node.left.data + ",");
				queue.add(Node.left);
			} else {
				System.out.println("L:" + -1 + ",");
			}
			if (Node.right != null) {
				System.out.println("R:" + Node.left.data + ",");
				queue.add(Node.right);
			} else {
				System.out.println("R:" + -1);
			}
			System.out.println();
		}

	}

	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			return false;
		}
		if (root.data == x) {
			return true;
		}

		return (isNodePresent(root.left, x) || isNodePresent(root.right, x));
	}

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + "";
		if (root.left != null) {
			toBePrinted += "L :" + root.left.data + ",";
		}
		if (root.right != null) {
			toBePrinted += "R :" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}

	public static BinaryTreeNode<Integer> takesInput(Scanner s) {
		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takesInput(s);
		root.right = takesInput(s);
		return root;
	}

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter the left child " + front.data);
			int leftchild = s.nextInt();
			if (leftchild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftchild);
				pendingNodes.enqueue(child);
				front.left = child;

			}
			System.out.println("Enter the right child " + front.data);
			int rightchild = s.nextInt();
			if (rightchild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightchild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}

	public static int countNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		return ans;
	}

	public static int getSum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}

		int smallsum = getSum(root.left) + getSum(root.right);
		return root.data + smallsum;
	}

	public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (root.left == null && root.right == null) {
			return null;
		}
		root.left = removeLeaves(root.left);
		root.right = removeLeaves(root.right);
		return root;
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);
		
		return 1 + Math.max(leftHeight, rightHeight);
	}
	
	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return true;
		}
		int leftheight = height(root.left);
		int rightheight = height(root.right);
		if (Math.abs(leftheight - rightheight) > 1) {
			return false;
		}
		boolean isLeftBalanced = isBalanced(root.left);
		boolean isRightBalanced = isBalanced(root.right);
		
		return isLeftBalanced && isRightBalanced;
	}

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printTree(root);
//		System.out.println(countNodes(root));
//		System.out.println(isNodePresent(root, 2));
//		s.close();

//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//		root.left = node1;
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//		root.right = node2;
		System.out.println("largest " + largest(root));
		System.out.println("num Leaves " + numLeaves(root));
		System.out.println("print At Depth k ");
		printAtDepthK(root, 2);
		printNodesWithoutSibling(root);

//		BinaryTreeNode<Integer> newRoot = removeLeaves(root);
//		printTree(newRoot);
		
       System.out.println("Is Balancec " + isBalanced(root));
	}

}
