package for_Loop;

import java.util.Scanner;

public class for_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		/*int i = 1;
		int sum = 0;
		while(i<=n) {
			sum =sum+i;
			i++;
			}
			System.out.println(sum);
		
		*/
		int sum = 0;
		for (int i = 1, j = 1; i <= n; i=i+1,j = j+1) {
			sum=sum+i;
		}
			System.out.println(sum);
		}
		
	}

