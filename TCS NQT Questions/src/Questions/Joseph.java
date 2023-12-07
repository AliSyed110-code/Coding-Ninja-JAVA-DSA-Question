package Questions;

import java.util.Scanner;

public class Joseph {

	public static void main(String[] args) {

//		Scanner s =  new Scanner(System.in);
//        int n = s.nextInt();
//        
//        String bin = "";
//        
//        while(n !=0) {
//        	bin = (n & 1)+ bin;
//        	n = n>>1;
//        }
//        bin=bin.replaceAll("1", "2");
//        bin=bin.replaceAll("0", "1");
//        bin=bin.replaceAll("2", "0");
//        int res = Integer.parseInt(bin,2);
//        
//        System.out.println(res);
//        
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int ans = 0;
		int index = 0;
		while (n > 0) {
			if ((n & 1) == 0) {
				ans = ans + (int) Math.pow(2, index);
			}
			index++;
			n = n / 2;
		}
		System.out.println(ans);
	}

}
