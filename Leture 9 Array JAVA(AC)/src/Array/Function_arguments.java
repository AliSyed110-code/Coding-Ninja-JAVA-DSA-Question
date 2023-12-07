package Array;

public class Function_arguments {

	public static void update(int input[], int nonchangable) {

		nonchangable = 10;
		for (int i = 0; i < input.length; i++) {
			input[i] = input[i] + 1;
		}
	}

	public static void main(String[] args) {

		int input[] = { 97, 98, 99 };
		int nonChangable = 5;

		update(input, nonChangable);

		System.out.println(nonChangable);

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
		System.out.println();
	}

}
