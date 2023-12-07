package Strings;

public class Strings_Immutability {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc";
		String str1 = "abc";
		String str2 = new String("abc");
		String str3 = "abc";
        str1 = str1+"def";
        str = "xyz";
        System.out.println(str1);
       // str.setCharAt(i)= 'i';   // Wrong! you cannot change the String letter once String has been created.
	}

}
