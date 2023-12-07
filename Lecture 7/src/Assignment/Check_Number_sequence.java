package Assignment;

import java.util.Scanner;

public class Check_Number_sequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int  n = s.nextInt();
       int []num=new int [n];
       int count = 0;
       int temp=0;
       int same = 0;
       for (int i=0;i<n;i++)
       {
    	   num[i] = s.nextInt();
       }boolean flag = true;
       for (int i = 0 ; i<n-2;i++) {
    	   if (num[i]<num[i+1]&& num[i + 1]>num[i+2]) {
    		   flag = false;
    		   break;
    	   }
       }
        System.out.println(flag);
	}

}
