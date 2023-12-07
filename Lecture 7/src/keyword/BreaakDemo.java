package keyword;

import java.util.Scanner;

public class BreaakDemo {

	public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    boolean divided = false ;
    for (int d = 2; d<n ; d++) {
    	if (n%2==0) {
    		divided = true;
    		break;
    	}
    }	
    		if (divided) {
    	    	System.out.println("Not Prime ");
    	    	}else {
    	    		System.out.println("prime");
    }
    
    int d=2;
   divided = false ;
    while (d<n) {
    	if (n%2==0) {
    		divided = true;
    		break;
    	}
    	d=d+1;
    }
    if (divided) {
    	System.out.println("Not Prime ");
    	}else {
    		System.out.println("prime");
    }
	}
}

