package Binary_Trees;

public class practice {

	public static pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			pair<Integer, Integer> output = new pair<Integer, Integer>();
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

		pair<Integer, Integer> output = new pair<Integer, Integer>();
		output.first = height;
		output.second = diameter;
		return output;

	}

	public static void main(String[] args) {

	}

}
