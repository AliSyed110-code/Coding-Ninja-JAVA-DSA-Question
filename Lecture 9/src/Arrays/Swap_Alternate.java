package Arrays;

import java.util.Scanner;

public class Swap_Alternate {
	
	    public static void swapAlternate(int arr[]) {
	    	//Your code goes here
	            int n = arr.length;
	            for(int i=0;i<n-1;i=i+2){
	            int t = arr[i];
	            arr[i] = arr[i+1];
	            arr[i+1] = t;
	            
	        }
	            print(arr);
	            
	    }
	   
	private static void print(int[] arr) {
      for(int i =0 ;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
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
		
     int arr[]= takesinput();
     swapAlternate(arr);
	}
}
