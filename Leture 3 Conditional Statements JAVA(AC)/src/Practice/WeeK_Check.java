package Practice;

import java.util.Scanner;

public class WeeK_Check {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Enter week number(1-7): ");
		int n = s.nextInt();

		switch (n) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wenesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Invalidinput! Please enter week number between 6781-7.");
		}
	}

}
