package Patterns;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int i = 1;
		while (i<=n) {
			int j=2;
			while (j<=i){
				System.out.print(" ");
				j++;
			}    
			 j=1;
			 while (j<=n) {
				 System.out.print("*");
				 j++;
			 }
				
			System.out.println();
			i++;
		}

	}

}
