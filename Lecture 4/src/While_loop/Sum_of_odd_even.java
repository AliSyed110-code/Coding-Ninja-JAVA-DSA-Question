package While_loop;

import java.util.Scanner;

public class Sum_of_odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int digit;
		int sumeven = 0;
		int sumodd  = 0;
		while (n>0) 
		{  
			digit=n%10;
			n=n/10;
			if (digit%2==0) {
         sumeven = sumeven+digit;
         
		
		}else { sumodd = sumodd+digit;
			
		}
		
	}
    System.out.println(sumeven +" "+sumodd);
   
}
}
