package javacourse1;

import java.util.Scanner;

public class starpatternquestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();

	}

}
}
