package Strings;

public class String_Check_Palindrome {
	

	public static boolean CheckPalindrome(String str) {
		String check ="";
		for(int i = 0;i<str.length();i++) {
			check = str.charAt(i)+ check;
		}
		return (check.equals(str));
	}
	public static void main(String[] args) {
		 String str = "abba";
	
	 boolean check =CheckPalindrome(str);
	 System.out.println(check);
	}

}
