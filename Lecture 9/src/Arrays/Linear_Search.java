package Arrays;

import java.util.Scanner;

public class Linear_Search {
	
	public static int  linearSearch(int arr[] , int x) {
		for(int i = 0 ;i<arr.length;i++) {
			if(arr[i]==x) {
				return i;
			}
		}
		return -1;
	}
    static Scanner s = new Scanner(System.in);
	public static int [] takesinput() {
		int size = s.nextInt();
	    int arr[] = new int[size];
	    for (int i = 0 ; i<size ; i++) {
	    	arr[i]=s.nextInt();
	    }
	    return arr;
	}
	public static void main(String[] args) {
    int arr[] = takesinput();
    int x = s.nextInt();
    System.out.print(Linear_Search.linearSearch(arr,x));
	}

}
