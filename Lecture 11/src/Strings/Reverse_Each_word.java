package Strings;
import java.util.Scanner;

public class Reverse_Each_word {

	public static String reverseEachWord(String str) {
		String ans = " ";
		int  currentWordStart = 0;
		int i = 0;
		for ( ; i<str.length();i++) {
			if ( str.charAt(i) ==' ') {
				//Reverse currentword
				int currentWordend = i - 1;
				String reversedword = "";
			for (int j = currentWordStart;j<=currentWordend;j++) {
				reversedword = str.charAt(j) + reversedword;
			}
			// Add it final String (ans)
			ans +=reversedword + " ";
			currentWordStart = i + 1;
			}
		}
			int currentWordend = i - 1;
			String reversedword = "";
		for (int j = currentWordStart;j<=currentWordend;j++) {
			reversedword = str.charAt(j) + reversedword;
		}
		
		ans +=reversedword;
		
		return ans;
		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String reverse = reverseEachWord(str);
		System.out.println(reverse);

	}

}
