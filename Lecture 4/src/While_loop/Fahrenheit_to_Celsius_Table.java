package While_loop;

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    int f = s.nextInt();
    int e = s.nextInt();
    int w = s.nextInt();
  
    
    while (f<=e) 
    {
     
      int cel = (5*(f-32))/9;
        System.out.println(f+" "+cel);
       f = f + w;
    }
    
}
}
