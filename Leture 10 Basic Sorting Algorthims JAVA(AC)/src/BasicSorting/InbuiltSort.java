package BasicSorting;

import java.util.*;

public class InbuiltSort {

	public static void print(Integer[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}

	}

	public static void main(String[] args) {

		Integer input[] = { 5, 4, 1, 3, 2 };
//		  Arrays.sort(input);
//        print(input);
//        Arrays.sort(input, 0, 3);
//		Arrays.sort(input, Collections.reverseOrder());
		Arrays.sort(input, 0, 3, Collections.reverseOrder());
		print(input);
	}

}
