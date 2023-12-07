package Recursion_1;

public class All_Indices_of_Number {

	public static int[] allIndexes(int input[], int x) {
		return allIndexes(input, x, 0);
	}

	public static int[] allIndexes(int input[], int x, int startIndex) {
		if (startIndex == input.length) {
			int zero[] = new int[0];
			return zero;
		}
		int smallAns[] = allIndexes(input, x, startIndex + 1);
		if (input[startIndex] == x) {
			int answer[] = new int[smallAns.length + 1];
			answer[0] = startIndex;
			for (int i = 0; i < smallAns.length; i++) {
				answer[i + 1] = smallAns[i];
			}
			return answer;
		} else {
			return smallAns;
		}
	}

	public static void main(String[] args) {

		int input[] = { 9, 8, 10, 8 };
		int x = 8;
		System.out.println(allIndexes(input, x, 0));

	}

}
