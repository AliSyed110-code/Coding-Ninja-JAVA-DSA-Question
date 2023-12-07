package Practice;

import java.util.Scanner;

public class Fever_Check {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
	    double temp = s.nextDouble();
	    
	    if(temp>100) {
	    	System.out.println("You have a fever");
	    }else {
	    	System.out.println("You don't have a fever");
	    }
		
	}

}
