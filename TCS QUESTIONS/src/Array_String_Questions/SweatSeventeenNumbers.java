package Array_String_Questions;

import java.util.Scanner;

public class SweatSeventeenNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int ans = 0;
		int pow = 0;
		
		for(int i = str.length()-1;i>=0;i--) {
			if(str.charAt(i)>='A' && str.charAt(i)<='G') {
				int m =(int)(Math.pow(17, pow));
				pow++;
				int val = str.charAt(i) - 55;
				int mul = val*m;
				ans = ans + mul;
			}else {
				int m =(int)(Math.pow(17, pow));
				pow++;
				int val = str.charAt(i) - '0';
				int mul = val*m;
				ans = ans + mul;
			}
		}
         System.out.println(ans);
	}

}
