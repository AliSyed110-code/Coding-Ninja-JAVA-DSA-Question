package BST_1;

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

	public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			int height = 0;
			boolean isBal = true;

			BalancedTreeReturn ans = new BalancedTreeReturn();
			ans.height = height;
			ans.isBalanced = isBal;
			return ans;
		}
		BalancedTreeReturn leftoutput = isBalancedBetter(root.left);
		BalancedTreeReturn rightoutput = isBalancedBetter(root.right);
		boolean isBal = true;
		int height = 1 + Math.max(leftoutput.height, rightoutput.height);

		if (Math.abs(leftoutput.height - rightoutput.height) > 1) {
			isBal = false;
		}
		if (!leftoutput.isBalanced || !rightoutput.isBalanced) {
			isBal = false;
		}
		BalancedTreeReturn ans = new BalancedTreeReturn();
		ans.height = height;
		ans.isBalanced = isBal;
		return ans;
	}

	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int leftHeight = height(root.left);
		int rightHeight = height(root.right);

		return 1 + Math.max(leftHeight, rightHeight);
	}

	public static boolean isBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
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

	public static int diameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);

		return Math.max(option1, Math.max(option2, option3));
	}

	public static pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			pair<Integer, Integer> output = new pair<>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		pair<Integer, Integer> lo = heightDiameter(root.left);
		pair<Integer, Integer> ro = heightDiameter(root.right);
		int height = 1 + Math.max(lo.first, ro.first);
		int option1 = lo.first + ro.first;
		int option2 = lo.second;
		int option3 = ro.second;
		int diameter = Math.max(option1, Math.max(option2, option3));

		pair<Integer, Integer> output = new pair<>();
		output.first = height;
		output.second = diameter;
		return output;
	}

	public static void inorder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder(root.right);
	}

	public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[], int inS, int inE, int preS, int preE) {
		if (inS > inE) {
			return null;
		}
		int rootData = pre[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);

		int rootInIndex = -1;
		for (int i = inS; i <= inE; i++) {
			if (in[i] == rootData) {
				rootInIndex = i;
				break;
			}
		}
		if (rootInIndex == -1) {
			return null;
		}

		int leftInS = inS;
		int leftInE = rootInIndex - 1;
		int leftPreS = preS + 1;
		int leftPreE = leftInE - leftInS + leftPreS;
		int rightInS = rootInIndex + 1;
		int rightInE = inE;
		int rightPreS = leftPreE + 1;
		int rightPreE = preE;
		root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
		root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
		return root;
	}

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		return buildTreeHelper(inOrder, preOrder, 0, inOrder.length - 1, 0, preOrder.length - 1);
	}

	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}

	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}

	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftmax = maximum(root.left);
		int rightmin = minimum(root.right);

		if (root.data <= leftmax) {
			return false;
		}
		if (root.data > rightmin) {
			return false;
		}
		boolean isleftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);

		if (isleftBST && isRightBST) {
			return true;
		} else {
			return false;
		}
	}

	public static pair<Boolean, pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
		if (root == null) {
			pair<Boolean, pair<Integer, Integer>> output = new pair<Boolean, pair<Integer, Integer>>();
			output.first = true;
			output.second = new pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		pair<Boolean, pair<Integer, Integer>> leftOutput = isBST2(root);
		pair<Boolean, pair<Integer, Integer>> rightOutput = isBST2(root);

		int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));

		boolean isBST = (root.data > leftOutput.second.second) && (root.data <= rightOutput.second.first)
				&& leftOutput.first && rightOutput.first;

		pair<Boolean, pair<Integer, Integer>> output = new pair<Boolean, pair<Integer, Integer>>();
		output.first = isBST;
		output.second = new pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
	}

	public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		boolean isLeftOk = isBST3(root.left, min, root.data - 1);
		boolean isRightOk = isBST3(root.right, root.data, max);
		return isLeftOk && isRightOk;
	}

	public static void main(String[] args) {

//		Scanner s = new Scanner(System.in);
//		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		printTree(root);
//		System.out.println(countNodes(root));
//		System.out.println(isNodePresent(root, 2));
//		s.close();

//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//		root.left = node1;
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//		root.right = node2;
//		System.out.println("largest " + largest(root));
//		System.out.println("num Leaves " + numLeaves(root));
//		System.out.println("print At Depth k ");
//		printAtDepthK(root, 2);
//		printNodesWithoutSibling(root);
//		System.out.println();
//
//		System.out.println("Height " + heightDiameter(root).first);
//
//		System.out.println("Diameter " + heightDiameter(root).second);

//		System.out.println("Is Balanced " + isBalancedBetter(root).isBalanced);

		int in[] = { 4, 2, 5, 1, 3, 7 };
		int pre[] = { 1, 2, 4, 5, 3, 7 };
		BinaryTreeNode<Integer> root = buildTree(in, pre);
		printTree(root);

	}

}
