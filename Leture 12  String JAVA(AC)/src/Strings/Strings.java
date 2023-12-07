package Strings;

import java.util.Scanner;

public class Strings {

	public static void printLetter(String str) {
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

//		char arr[] = { 'a', 'b', 'c', 'd' };
//		String str = "abcd";
//		String str2 = new String("xyz");
//
//		// String are IMMUTABLE
//
//		Scanner s = new Scanner(System.in);
//
//		String name = s.nextLine();
//		System.out.println(name);
//
//		String fullName = "Tony Stark";
//		System.out.println(fullName.length());

		// Concatenate

//		String FirstName = "Syed";
//		String LastName = "Ali";
//		String FullName = FirstName + " " + LastName;

//		System.out.println(FullName);
//		System.out.println(FirstName.concat(LastName));
//		System.out.println(FullName.charAt(1));

//		printLetter(FullName);

		String s1 = "Tony";
		String s2 = "Tony";
		String s3 = new String("Tony");

		if (s1 == s2) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
		
		
//		if (s1 == s3) {
//			System.out.println("Strings are equal");
//		} else {
//			System.out.println("Strings are not equal");
//		}
		
		
		if (s1.equals(s3)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}
}
