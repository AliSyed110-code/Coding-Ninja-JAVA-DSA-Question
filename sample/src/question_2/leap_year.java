package question_2;
import java.util.Scanner;

public class leap_year {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int year = S.nextInt();
		if (year%4==0) {
			if (year/1000 !=0) {
				System.out.println("This leap year");
			}
			else {System.out.println("This year not leap year");
				
			}
		}
	
	

	}

}
