package Patterns;

import java.util.Scanner;

public class pattern9 {

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("*");
        int cr=1;
        while(cr<=n)
        {
            System.out.print("*");
            int cc=1;
            while(cc<=cr)
            {
                System.out.print(cc);
                cc +=1;
                
            }
            cc=cc-2;
            while(cc>=1){
                System.out.print(cc);
                cc -=1;
            }
            System.out.println("*");
            cr +=1;
        }
        cr=1;
        while(cr<=n-1)
        {
            System.out.print("*");
            int cc=1;
            while(cc<=n-cr){
                System.out.print(cc);
                cc +=1;
            }
            cc=cc-2;
            while(cc>=1)
            {
                System.out.print(cc);
                cc -=1;
            }
            System.out.println("*");
            cr +=1;
        }
        System.out.print("*");
        
    }
}