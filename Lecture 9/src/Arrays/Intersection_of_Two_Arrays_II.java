package Arrays;

import java.util.Scanner;

public class Intersection_of_Two_Arrays_II {

	public static void intersections(int arr1[], int arr2[]) {
		for(int i = 0 ; i < arr1.length; i++)
        {
            for(int j = 0; j < arr2.length ; j++)
            {
                if(arr1[i] == arr2[j] )
                {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
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
		int arr1[] = takesinput();
		int arr2[] = takesinput();
		intersections(arr1,arr2);
		
	}

}
