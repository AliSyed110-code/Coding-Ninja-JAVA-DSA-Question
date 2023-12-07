package for_Loop;

import java.util.Scanner;

public class Nth_fibonacci_Numbers {

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	 int n=s.nextInt();
	 int a=1;
	 int b=1;
	 int c=1;
	 for (int i =2 ;i<n;i++) {
		 c=a+b;
		 a=b;
		 b=c;
	 }
	System.out.println(c);

	}

}
