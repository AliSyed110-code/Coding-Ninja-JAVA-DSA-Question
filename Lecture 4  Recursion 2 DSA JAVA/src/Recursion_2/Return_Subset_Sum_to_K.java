package Recursion_2;

public class Return_Subset_Sum_to_K {

	public static int[][] subsetsSum(int input[], int start, int k) {
		if (input.length == start) {
			if (k == 0) {
				return new int[1][0];
			} else {
				return new int[0][0];
			}
		}
		// Include first elements
		int result1[][] = subsetsSum(input, start + 1, k - input[start]);

		// not Include first elements 
		int result2[][] = subsetsSum(input,start+1,k);
		
		int result[][]= new int [result1.length + result2.length][];
		
		// result 2 as it is 
		
		int index = 0;
		for(int i = 0;i<result2.length;i++) {
			result[index++]= result[i];
		}
		
		// copy result1 by adding first element
	
		for(int i = 0;i<result1.length;i++) {
			result[index] = new int[result1[i].length + 1];
			result [index][0] = input[start];
			for(int j = 0;j<result1[i].length;j++) {
				result[index][j+1]=result1[i][j];
			}
			index++;
		}
		return result;
	}
	
	public static int [][] subsetsSumK(int input[],int k){
		return subsetsSum(input,0,k);
	}

	public static void main(String[] args) {

	}

}
