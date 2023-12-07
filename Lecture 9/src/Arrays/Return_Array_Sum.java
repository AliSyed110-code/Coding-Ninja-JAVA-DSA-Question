package Arrays;

import java.util.Scanner;

public class Return_Array_Sum {

	    public static int []takesinput(){
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int input []= new int [size];
		for (int i = 0 ; i < size ;i++) {
			input[i] = s.nextInt() ;
		}
		return input;
	}
	  
	public static int sum(int[] input) {
		int sum =0;
		for (int i=0; i<input.length;i++) {
			sum = sum+input[i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int input[]= takesinput();
		int allsum = sum(input);
		System.out.println(allsum);
		

	}

}
