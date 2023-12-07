package pattern;

import java.util.Scanner;

public class pattern12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	     int n = s.nextInt();
	     int i = 1;
	     while (i<=n) {
	    	 int j = 1;
	    	 char startingchar = (char)('A'+i-1);
	    	 while (j<=n) {
	    	 System.out.print(startingchar);
	    	 j++;
	    	 startingchar = (char)(startingchar + 1);
	     }
         System.out.println();
         i++;
	}

}
}