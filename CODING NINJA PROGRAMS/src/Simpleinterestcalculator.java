import java.util.Scanner;

public class Simpleinterestcalculator {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int P = s.nextInt();
		int R = s.nextInt();
		int T = s.nextInt();
		int SI =   (P*R*T)/100;
		System.out.println(SI);
	}

}
