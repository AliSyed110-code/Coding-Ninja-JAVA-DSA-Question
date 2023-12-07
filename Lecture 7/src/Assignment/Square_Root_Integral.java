package Assignment;

import java.util.Scanner;

public class Square_Root_Integral {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int  n = s.nextInt(); // 10
	        int ans = 0;
	        
	        // System.out.println( (int) Math.sqrt(n) );
	        
	        
	        for( int i = 1 ; i * i <= n; ++i){
	            ans = i;
	        }
	        
	        // ans = 3
	        
	        System.out.println( ans );
	        
	        
	    }
	}


