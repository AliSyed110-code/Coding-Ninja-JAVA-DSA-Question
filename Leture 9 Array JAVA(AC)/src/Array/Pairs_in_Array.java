package Array;

public class Pairs_in_Array {

	public static void pairs(int input[]) {
		
		int tp = 0;
		for (int i = 0; i < input.length; i++) {
			int curr = input[i];
			for (int j = i + 1; j < input.length; j++) {
				System.out.print("(" + curr + "," + input[j] + ")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("Total pairs : " + tp);
	}

	public static void main(String[] args) {

		int input[] = { 2, 4, 6, 8, 10 };
		pairs(input);
	}

}
