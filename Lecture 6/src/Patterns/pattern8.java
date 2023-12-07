package Patterns;
import java.util.Scanner;
public class pattern8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int n1 =(n+1)/2;
		int i = 1;
		while (i<=n1) {
		 int spaces = 1;
		 while (spaces<=n1-i) {
			 System.out.print(" ");
			 spaces++;
		}
		 int j = 1;
		 while (j<=2*i-1) {
			 System.out.print("*");
			 j++;
		 }
		 System.out.println();
			i++;
		}
		 int n2 = n1-1;
	   	  i= n2;
          while (i>=1) {
        	  int spaces2=1;
        	  while (spaces2<=n2-i+1) {
        	  System.out.print(" ");
        	  spaces2++;
        	  
        	  }
        	   int j =1;
        	  while (j<=2*i-1) {
        		  System.out.print("*");
        		  j++;
        	  }
     
		System.out.println();
		i--;
			
			
		}
		
	}
}

		