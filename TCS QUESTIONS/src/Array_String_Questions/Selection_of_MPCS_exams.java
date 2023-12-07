package Array_String_Questions;

import java.util.Scanner;

public class Selection_of_MPCS_exams {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int round = s.nextInt();
		int trainee = s.nextInt();
		int arr[][] = new int[round][trainee];
		for (int rows = 0; rows < round; rows++) {
			for (int cols = 0; cols < trainee; cols++) {
				int var = s.nextInt();
				if (var >= 1 && var <= 100) {
					arr[rows][cols] = var;
				} else {
					arr[rows][cols] = 0;
				}
			}
		}
		int avg[] = new int[trainee];
		int k = 0;
		int average = 0;
		for (int cols = 0; cols < trainee; cols++) {
			int sum = 0;
			for (int rows = 0; rows < round; rows++) {
				sum = sum + arr[rows][cols];
			}
			average = sum / round;
			avg[k] = average;
			k++;
		}
		int sum = 0;
		for (int i = 0; i < avg.length; i++) {
			sum = sum + avg[i];
		}
		int average1 = sum / avg.length;
		for (int i = 0; i < avg.length; i++) {
			if (avg[i] > average1 && avg[i] > 70) {
				int n = i + 1;
				System.out.println("Trainee Number : " + n);
			}
		}

	}
}
