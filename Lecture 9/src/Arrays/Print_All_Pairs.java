package Arrays;

import java.util.Scanner;

public class Print_All_Pairs {

	public static void  printAllpairs(int []arr) {
		int n = arr.length;
		for (int i = 0 ; i<n-1;i++) {
			for (int j = i+1;j<n;j++) {
				System.out.println("(" + arr[i]+ ","+arr[j]+")");
			}
		}
	}
	public static int[] takesinput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[]= new int [size];
		for (int i=0; i<size; i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr = takesinput();
     printAllpairs(arr);
	}

}
