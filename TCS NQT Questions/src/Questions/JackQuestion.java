package Questions;

import java.util.Scanner;

public class JackQuestion {

	public static void main(String[] args) {
      Scanner s = new Scanner(System.in);	
      String str = s.next();
      int n = s.nextInt();
      String arr[] = {"mon","tue","wed","thu","fri","sat","sun"};
      
      int i = 0;
      for(i = 0 ;i<=arr.length;i++) {
    	  if(arr[i].equals(str)) {
    		  break;
    	  }
      }
      
      int val = 6-i;
      n = n -val;
      if(n<0) {
    	  System.out.println(0);
      }else {
    	int sunday = 1+n/7;
    	System.out.println(sunday);
      }
      
      
	}

}
