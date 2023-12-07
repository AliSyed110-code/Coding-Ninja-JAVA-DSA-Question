package Operators;
import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		boolean AisLargest  = (a>=b)&&(a>=c);
		System.out.println(AisLargest);
		System.out.println((a>=b)||(a>=c));
		System.out.println(!(a>=b));
	}

}
