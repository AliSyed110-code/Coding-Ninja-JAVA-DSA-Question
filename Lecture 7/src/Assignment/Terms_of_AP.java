package Assignment;

import java.util.Scanner;

public class Terms_of_AP {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int count=1;
		for (int i = 1; count<=n ; i++) {
			int term = 3*i+2 ;
			if (term%4!=0) {
				System.out.print(term+" ");
			count++;
			}
			
		}

	}

}
