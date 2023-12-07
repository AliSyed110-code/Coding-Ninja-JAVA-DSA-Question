package com.company;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int twod[][] = new int [3][2];
	  
	 
	 
	 boolean flag = true;
	 for (int i = 0 ; i<3;i++) {
		 for (int j = 0 ; j<3;j++) {
			 if (i==j&&mat[i][j]!=1) {
				 flag = false;
			 }
			 if (i!=j&&mat[i][j]!=0) {
				 flag = false;
			 }
		 }
	 }

	 if(flag==true) {
		 System.out.println("Identity matrix");
	 }
	}

}
