package Strings;

import java.util.Scanner;

public class Reverse_String_Wordwise {
	public static String reverseWordWise(String input) {
		// Write your code here
        input = input + " ";
        
        String wd = "";
        String ans = "";
        
        for(int i = 0; i < input.length(); i++)
        {
            char ch = input.charAt(i);
            //If space found
            if(ch != ' ')
            {
                wd = wd + ch;
            }
            
            //To make ans
            else{
                ans = wd + " "+ans;
                wd = "";
            }
            
        }
		return ans;
	}


	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.nextLine();
		String reverse = reverseWordWise(input);
		System.out.println(reverse);

	}

}
