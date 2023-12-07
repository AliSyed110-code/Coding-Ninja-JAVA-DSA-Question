package TEST__1;

import java.util.*;
import java.lang.*;

public class Profit_On_App {
	
	public static int maximumProfit(int budget[]) {
		
		Arrays.sort(budget);
		
	/*	for (int  i = 0;i<budget.length;i++) {
			
			System.out.println(budget[i] + " ");
		}
		System.out.println();
	}*/
		
		int ans  = Integer.MIN_VALUE;
		int n = budget.length;
		// sort (budget,budget + n);
		
		for(int i = 0;i<n;i++) {
			
			ans = Math.max(ans, budget[i]*(n - i));
		}
		return ans;
	}

	public static void main(String[] args) {

	}

}
