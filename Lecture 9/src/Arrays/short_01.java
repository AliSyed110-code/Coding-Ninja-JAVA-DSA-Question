package Arrays;

import java.util.Scanner;

public class short_01 {
	
	public static void sortZeroesAndOne(int[] arr) {
    	//Your code goes here
        int count = 0; // counts the no of zeros in arr
     
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == 0)
                count++;
        }
 
        // loop fills the arr with 0 until count
        for(int i = 0; i < count; i++)
            arr[i] = 0;
 
        // loop fills remaining arr space with 1
        for(int i = count; i < arr.length; i++)
            arr[i] = 1;
        print(arr);
    }

	
	private static void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" ");
		}
		
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
		sortZeroesAndOne(arr);

	}

}
