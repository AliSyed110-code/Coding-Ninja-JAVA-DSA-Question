package FunctionsQuestion;
import java.util.Scanner;

public class questionaverage {
	public questionaverage() {
		// TODO Auto-generated constructor stub
	}	
	public static void printAverage(int a, int b) {
		int avg =(a+b)/2;
		System.out.println(avg);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		printAverage(a,b);

	}

}
