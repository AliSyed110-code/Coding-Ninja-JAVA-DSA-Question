package Assignment;

import java.util.Scanner;

public class Decimal_to_Binary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long n = s.nextInt();
		long i=1;
		long binary = 0;
		long rem;
		while(n!=0) {
		 rem = n%2;
		 binary += i*rem;
		 n = n/2;
		 i=i*10;
		}
        System.out.println(binary);
	}

}
