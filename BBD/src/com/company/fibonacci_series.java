package com.company;

import java.util.Scanner;

public class fibonacci_series {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int pos = S.nextInt();
		int a = 0;
		int b = 1;
		System.out.println(a);
        System.out.println(b);
        for (int i = 2 ; i<pos;i++) {
        int c = a+b;
       System.out.println(c);
        a=b;
        b=c;
        }
	}

}
 