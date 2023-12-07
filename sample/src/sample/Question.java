package sample;
import java.util.Scanner;

public class Question 
{
	public static void main(String args[]) 
	
	{
		float p, r, t, simpleinterest;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the principal :");
		p = scan.nextInt();
		System.out.println("Enter the rate of interest : ");
	    r = scan.nextInt();
	    System.out.println("Enter the time : ");
	    t = scan.nextInt();
	    scan.close();
	    simpleinterest = (p * r * t)/100;
	    System.out.println("simple Interest is :");
	}
}	
	    		
	
		
		
	
	
	


