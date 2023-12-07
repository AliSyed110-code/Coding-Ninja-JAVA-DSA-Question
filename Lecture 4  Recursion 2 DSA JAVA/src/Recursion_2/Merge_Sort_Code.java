package Recursion_2;

public class Merge_Sort_Code {

	static void mergSort(int input [],int sI,int eI) {
		if(sI>=eI) {
			return ;
		}
		int mid = (sI + eI)/2;
		// Part1
		mergSort(input, sI, mid);
		// Part2
		mergSort(input,mid + 1, eI);
		merge(input, sI, eI);
	}
	
	private static void merge(int [] input,int sI,int eI) {
		int mid = (sI + eI)/2;
		
		int ans [] = new int[eI - sI + 1];
		int i = sI;
		int j = mid + 1;
		int k = 0;
		while (i<=mid && j<=eI) {
			if(input[i]<input[j]) {
				ans[k] = input[i];
				i++;
				k++;
			}else {
				ans[k] = input[j];
				k++;
				j++;
			}
		}
		while(i <=mid) {
			ans[k] = input[i];
			i++;
			k++;
		}
		while(j<= eI) {
			ans[k] = input[j];
			k++;
			j++;
		}
		for(int index = 0;index<ans.length;index++) {
			input[sI + index] = ans[index];
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[] = {5,2,8,9,1};
		mergSort(arr, 0, arr.length - 1);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] +  " ");
		}

	}

}
