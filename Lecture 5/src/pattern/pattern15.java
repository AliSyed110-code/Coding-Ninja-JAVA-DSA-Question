package pattern;

import java.util.Scanner;

public class pattern15 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     int n = s.nextInt();
	     int i = n;
	     while (i>=1) {
	    	 int j = i;
	    	 char startingchar = (char)( 'A' + i - 1);
	    	 while (j<=n) {
	    	 System.out.print(startingchar);
	    	 j++;
	    	 startingchar = (char)(startingchar + 1);
	     }
         System.out.println();
         i--;
	}

}
}