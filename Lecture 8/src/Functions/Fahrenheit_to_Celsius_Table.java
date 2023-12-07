package Functions;
import java .util.Scanner;
public class Fahrenheit_to_Celsius_Table {

public static void printFahrenheitTable(int start, int end, int step) {
	 
	for (int i = start; i<=end ;i+=step) {
		
	 double cel = (5*(i-32))/9;
	 System.out.println(i+" "+(int)cel);
	
	}
	}
     
}
