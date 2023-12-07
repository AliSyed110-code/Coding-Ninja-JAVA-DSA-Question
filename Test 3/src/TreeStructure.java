import java.util.ArrayList;

public class TreeStructure {

	class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data) {
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}

}
