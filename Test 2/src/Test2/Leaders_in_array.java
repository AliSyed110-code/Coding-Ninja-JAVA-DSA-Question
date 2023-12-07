package Test2;

public class Leaders_in_array {

	public static void leaders(int[] input) {
		for (int i = 0; i < input.length; i++) {
			boolean check = true;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] > input[i]) {
					check = false;
					break;
				}
			}
			if (check == true) {
				System.out.print(input[i] + " ");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
