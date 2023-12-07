package Array_String_Questions;

import java.util.Scanner;

public class A_party_has_been_organised_on_cruise {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int entry [] = new int [n];
		int exit [] = new int [n];
		for(int i = 0; i<entry.length;i++) {
			entry[i] = s.nextInt();
		}
        for (int i = 0;i<exit.length;i++) {
        	exit[i] = s.nextInt();
        }
        int maxCount = 0;
        int ans = 0;
        int hour = 0;
        
        for (int i = 0; i<entry.length;i++) {
        	maxCount = maxCount + entry[i] - exit[i];
        	if(ans < maxCount) {
        		ans = maxCount;
        		hour = i+1;
        	}
        }
        System.out.println(hour + " hour");
        System.out.println(ans);
	}

}
