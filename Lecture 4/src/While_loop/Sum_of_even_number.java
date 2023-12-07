package While_loop;

import java.util.Scanner;

public class Sum_of_even_number {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int i = 1;
		int sumeven = 0;
		while (i<=n) {
			if (i%2==0)
         sumeven = sumeven+i;
         i = i+1;
         
		}
		System.out.println(sumeven);
	}

}
