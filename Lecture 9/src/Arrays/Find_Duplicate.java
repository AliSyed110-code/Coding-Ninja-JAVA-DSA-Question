package Arrays;

import java.util.Scanner;

public class Find_Duplicate {

	public static int duplicateNumber(int arr[]) {
		for(int i = 0;i<(arr.length - 1);i++) {
			for(int j=i+1;j<arr.length;j++) {
					if (arr[i]==arr[j]) {
						return arr[i];
					}
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
		int arr[] = takesinput();
		int duplicateNumber = duplicateNumber(arr);
		System.out.println(duplicateNumber);
	}

}
