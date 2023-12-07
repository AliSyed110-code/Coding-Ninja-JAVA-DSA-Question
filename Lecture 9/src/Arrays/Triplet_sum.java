package Arrays;

import java.util.Scanner;

public class Triplet_sum {

	public static int Tripletsum(int arr[], int x) {
		int count=0;
		for (int i = 0; i<arr.length-2;i++) {
			for (int j = i+1;j<arr.length-1;j++) {
				for (int k = j+1;k<arr.length;k++) {
				if (arr[i]+arr[j]+arr[k]==x) {
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
			// TODO Auto-generated method stub
	    int arr[] =  takesinput();
	    Scanner s = new Scanner(System.in);
	    int x = s.nextInt();
	    int Triplesum = Tripletsum(arr, x);
	    System.out.println(Triplesum);
		}

	}


