package Maps;

import java.util.HashMap;

public class Extract_Unique_characters {

	public static String uniqueChar(String str) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				newStr = newStr + c;
				map.put(c, 1);
			}
		}
		return newStr;

	}

	public static void main(String[] args) {
	  String  str =  "ababaca";
	  System.out.println(uniqueChar(str));

	}

}
