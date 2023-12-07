package While_loop;

import java.util.Scanner;

public class Sum_of_N_number {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int n = S.nextInt();
		int i = 1;
		int sum = 0;
		
		while (i<=n) {
			sum = sum+i;
			i = i + 1;
			
		}
		System.out.println(sum); 

	}

}
