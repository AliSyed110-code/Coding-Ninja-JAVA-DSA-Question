package Arrays;

import java.util.Scanner;

public class Find_Unique {

	public static int unique(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			int j;
			for (j = 0;j<arr.length;j++) {
			if (i!=j) {	
			if(arr[i]==arr[j]) {
			   break;
			} 
			}
		}
			if (j==arr.length) {
				return arr[i];
			}
		}
		return Integer.MAX_VALUE;
	}
	public static int [] takesinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[]= new int [size];
		for(int i = 0; i<size;i++) {
		arr[i]=s.nextInt();
		
		}
		return arr;	
	}
	public static void main(String[] args) {
		int arr[]= takesinput();
        int unique = unique(arr);
        System.out.println(unique);
	}
}
