package BST_1;

public class Print_Elements_in_Range {

	public static void elementsInRangeK1K2(BinaryTreeNode<Integer> root,int k1,int k2){
		
		if(root == null) {
			return;
		}
		if(root.data >= k1 && root.data <= k2) {
			elementsInRangeK1K2(root.left, k1, k2);
			
			System.out.println(root.data + " ");
			
			
			elementsInRangeK1K2(root.right, k1, k2);
		}
		
 		if(root.data > k2) {
        elementsInRangeK1K2(root.left, k1, k2);			
		}
 		if(root.data < k1) {
 			elementsInRangeK1K2(root.right, k1, k2);
 		}
		
	}
	
	public static void main(String[] args) {
		
	}
	
}
