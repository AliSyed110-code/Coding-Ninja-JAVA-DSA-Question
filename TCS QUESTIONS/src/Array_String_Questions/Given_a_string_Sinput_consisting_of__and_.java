package Array_String_Questions;

import java.util.Scanner;

public class Given_a_string_Sinput_consisting_of__and_ {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		int count1 = 0 , count2 = 0;
		for (int i =0;i<str.length();i++) {
			if(str.charAt(i)=='*') {
			count1++;
		}else if (str.charAt(i)=='#') {
			count2++;
		}
	}
		System.out.println(count1 - count2);
	}
}
