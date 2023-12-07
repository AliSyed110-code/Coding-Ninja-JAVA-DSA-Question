package Strings;

import java.util.Scanner;

public class Reverse_String {
 
	public static String ReverseString(String str) {
		String reversedString = " ";
		
		for (int i = 0; i<str.length();i++) {            // Second method
		reversedString = str.charAt(i)+ reversedString;	
		}
		//for (int i = str.length()-1;i>=0;i--) {       // First method
		//	reversedString+=str.charAt(i);
		//}
		return reversedString;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String srt = s.nextLine();
		String reversedString = ReverseString(srt);
		System.out.println(reversedString);

	}

}
