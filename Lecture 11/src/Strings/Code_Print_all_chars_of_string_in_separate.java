package Strings;

import java.util.Scanner;

public class Code_Print_all_chars_of_string_in_separate {

	public static void printchars( String str) {
		for (int i = 0;i<str.length()-1;i++) {
			System.out.print(str.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		printchars(str);
		
	}
    
}
