package Arrays;

import java.util.Scanner;

public class Arrange_Numbers_in_Array {
	
	public static void arrange(int[] arr, int n) {
		int odd=1,even=n/2;
        even *= 2;
        int i=0;
        while (i<n)
        {
            if (odd>n)
            {
                arr[i] = even;
                even-=2;
            }
            else{
                arr[i] = odd;
                odd+=2;
            }
            i++;
        }
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
		int arr[]= takesinput();
		int n = s.nextInt();
		arrange(arr,n);
	

	}

}
