package Arrays;

import java.util.Scanner;

public class Moving_into_Function {
	
    public static int[] takesInput(){
    	Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input[] = new int [size];
		for (int i = 0 ; i < size; i++ ) {
	     input[i] = s.nextInt();
		}
    	return input;
    }
    
    public static void print(int input[]) {
    	int size = input.length; 
    	for (int i = 0 ; i < size; i++) {
     	   System.out.print(input[i]);
        }
    	System.out.println();
    }
    

	public static void main(String[] args) {
	 int arr[] = takesInput();
     print(arr);
}
}