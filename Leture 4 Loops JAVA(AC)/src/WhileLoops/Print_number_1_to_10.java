package WhileLoops;

import java.util.Scanner;

public class Print_number_1_to_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
