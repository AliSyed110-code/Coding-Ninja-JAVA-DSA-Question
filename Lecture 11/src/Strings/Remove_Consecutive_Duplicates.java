package Strings;

import java.util.Scanner;

public class Remove_Consecutive_Duplicates {

	public static String removeConsecutiveDuplicates(String str) {
		 String output = "";
		 int count ; 
		 for (int i = 0;i<str.length();i=i+count) {
			 count=1;
			 output = output+str.charAt(i);
		 for (int j = i+1;j<str.length();j++) {
			 if (str.charAt(i)==str.charAt(j)) {
				 count++;
			 }else {
				 break;
			 }
			 }
		 }
		 return output;	
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str =  s.nextLine();
		String remove = removeConsecutiveDuplicates(str);
		System.out.println(remove);
	}

}
