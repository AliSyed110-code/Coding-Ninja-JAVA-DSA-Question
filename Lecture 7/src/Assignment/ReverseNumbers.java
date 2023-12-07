package Assignment;

import java.util.Scanner;

public class ReverseNumbers {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int rem = 0;
	int rev = 0;
	for(;n!=0;n=n/10) {
		rem =n%10;
		rev =rev*10+rem;
	}
	System.out.println(rev);
}
}
