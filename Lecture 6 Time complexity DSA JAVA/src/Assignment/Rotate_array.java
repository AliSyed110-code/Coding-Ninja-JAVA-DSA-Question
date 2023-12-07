package Assignment;

public class Rotate_array {

	   public static void rotate(int[] arr, int d) {
		   
		   int n = arr.length;
		   int j = 0;
		   int i ;
		   int arr1[] = new int [n];
		   
		   for (i=d;i<n;i++) {
			   arr1[j] = arr[i];
			   j++;
		   }
		   for(i = 0;i<d;i++) {
			   arr1[j] = arr[i];
			   j++;
		   }
		   
		   for(i=0;i<n;i++) {
			   arr[i]  =  arr1[i];
			   System.out.print(arr[i] + " ");
		   }
		   
		   System.out.println();
		   
	   }
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5,6};
		rotate(arr, 2);
	}

}
