package Array;

public class Print_Subarrays {

	public static void PrintSubarrays(int input[]) {
		int ts = 0;
		for (int i = 0; i < input.length; i++) {
			for (int j = i; j < input.length; j++) {
				for (int k = i; k <= j; k++) {
					System.out.print(input[k] + ",");
				}
				System.out.println();
				ts++;
			}
			System.out.println();
		}
		System.out.println("Total Subarrays : " + ts);
	}

	public static void main(String[] args) {

		int input[] = { 2, 4, 6, 8, 10 };
		PrintSubarrays(input);
	}

}
