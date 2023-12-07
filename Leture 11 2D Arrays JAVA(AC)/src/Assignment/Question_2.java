package Assignment;

public class Question_2 {

	public static int Add(int input[][]) {
		int sum = 0;
		for (int i = 1; i < input.length; i += 2) {
			for (int j = 0; j < input[0].length; j++) {
				sum += input[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {

		int input[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
		System.out.println(Add(input));

	}

}
