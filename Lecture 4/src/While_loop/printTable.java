package While_loop;

import java.util.Scanner;

public class printTable {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt(); 
		int i = 1;
		while (i<=10) {
	     int t = (i*n);
	     System.out.println(t);
	     i = i+1;
		}

	}

}
