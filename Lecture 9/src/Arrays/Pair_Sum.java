package Arrays;

import java.util.Scanner;

public class Pair_Sum {


public static int pairSum(int arr[], int x) {
	int count=0;
	for (int i = 0; i<arr.length-1;i++) {
		for (int j= i+1;j<arr.length;j++) {
			if(i!=j) {
			if (arr[i]+arr[j]==x) {
				count++;
				}
			}
		}
	}
	return (count);
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
    int arr[] =  takesinput();
    Scanner s = new Scanner(System.in);
    int x = s.nextInt();
    int pairsum = pairSum(arr, x);
    System.out.println(pairsum);
	}

}
