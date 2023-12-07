package Test2;

public class Minimum_Length_Word {

	public static String minLengthWord(String input) {
		String minword = "";
		int prevSpace = 0;
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == ' ') {
				String word = input.substring(prevSpace + 1, i);
				if (word.length() < minword.length() || minword.length() == 0) {

					minword=word;
				}
				prevSpace=i;
			}
		}
		return minword;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
