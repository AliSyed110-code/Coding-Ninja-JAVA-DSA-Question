package Recursion_1;

public class Check_Number_in_Array {

	public static boolean checkNumber(int input[], int x) {
		if (input.length == 1) {
			if(input[0]==x) {
				return true;
			}else {
				return false;
			}
		}
		if(input[0]==x) {
			return true;
		}
		int prea[] = new int[input.length-1];
		for (int i = 0; i < input.length-1; i++) {
			prea[i] = input[i+1];
		}
		boolean check = checkNumber(prea, x);
		return check;
	}

	public static void main(String[] args) {

		int input[] = { 9, 8, 10 };
		int x = 9;
		System.out.println(checkNumber(input, x));
	}
}
