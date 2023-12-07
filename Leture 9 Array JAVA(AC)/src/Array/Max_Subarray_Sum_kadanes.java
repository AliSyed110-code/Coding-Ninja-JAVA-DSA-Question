package Array;

public class Max_Subarray_Sum_kadanes {

	public static void kadanes(int input[]) {

		int cs = 0;
		int maxS = Integer.MIN_VALUE;

		for (int j = 0; j < input.length; j++)

			for (int i = 0; i < input.length; i++) {
				cs += input[i];
				if (cs < 0) {
					cs = 0;
				}
				maxS = Math.max(maxS, cs);
			}
		System.out.println(maxS);

	}

	public static void main(String[] args) {
		int input[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		kadanes(input);

	}

}
