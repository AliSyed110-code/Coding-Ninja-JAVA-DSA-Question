package Practice;

public class Question1 {

	public static int CheckVowels(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String str = "a,d,g,g,i,o,f";
		System.out.println(CheckVowels(str));
	}
}
