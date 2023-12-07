package Assignment;

import java.util.Scanner;

public class Binary_to_decimal {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int remainder =1;
		int j = 1;
		int decimalNumber =0;
		for (;n!=0;n=n/10) {
			remainder =n%10;
			decimalNumber = decimalNumber+remainder*j;
			j=j*2;
		}
      System.out.println(decimalNumber);
	}

}
