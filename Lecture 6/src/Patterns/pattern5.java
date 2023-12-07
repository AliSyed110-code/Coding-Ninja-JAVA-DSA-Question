package Patterns;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i<=n) {
			int spaces = 1;
			while (spaces<=n-i) {
			spaces++;
			System.out.print(" ");
			
		}
		int j = 1;
		int p = 1;
		while (j<=i) {
			j++;
			System.out.print(p);
			p++;
		}
          p = i-1;
          j = 1;
         while (j<=i-1) {
        	 System.out.print(p);
        	 p--;
        	 j++;
         }
		
		System.out.println();
       i++;
	}

}
}