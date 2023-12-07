package Recursion_2;

public class Subsequences {

	public static String[] findsubsequences(String str) {
		if (str.length() == 0) {
			String ans[] = { "" };
			return ans;
		}
		String SmallAns[] = findsubsequences(str.substring(1));
		String ans[] = new String[2 * SmallAns.length];

		int k = 0;
		for (int i = 0; i < SmallAns.length; i++) {
			ans[k] = SmallAns[i];
			k++;
		}

		for (int i = 0; i < SmallAns.length; i++) {
			//ans[i + SmallAns.length]
			ans[k] = str.charAt(0) + SmallAns[i];
			k++;
		}
		return ans;
	}

	public static void main(String[] args) {
		
		String str = "xyz";
		String ans[] = findsubsequences(str);
		for(int i = 0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}

	}

}
