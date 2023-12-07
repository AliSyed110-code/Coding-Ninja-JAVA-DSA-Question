package Strings;
import java.util.Scanner;

public class Remove_Character {

	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String remove = "";
		int count = 1 ;
		for(int i = 0;i<str.length();i++) {
			if (str.charAt(i)==ch) {
				count++;
			}else 
			{
				remove = remove + str.charAt(i);
			}
		}return remove;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String n = s.next();
		char ch = str.charAt(0);
       String remove = removeAllOccurrencesOfChar(str, ch);
		System.out.println(remove);
	}
}
