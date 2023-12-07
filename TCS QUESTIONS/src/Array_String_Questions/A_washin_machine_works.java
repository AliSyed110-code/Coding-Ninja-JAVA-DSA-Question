package Array_String_Questions;

import java.util.Scanner;

public class A_washin_machine_works {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double weight = s.nextDouble();
		if(weight == 0) {
			System.out.println("Time Estimated: "+ 0 + " minutes");
			return;
		}if( weight >=1 && weight<=2000) {
			System.out.println("Time Estimated: "+ 25 + " minutes");
			return;
		}else if (weight>=2001&& weight <=4000) {
			System.out.println("Time Estimated: "+ 35 + " minutes");
			return;
		}else if (weight >=4001 && weight<=7000) {
			System.out.println("Time Estimated: "+ 45 + " minutes");
			return;
		}else 
			System.out.println("OVERLOADED");
	}

}
