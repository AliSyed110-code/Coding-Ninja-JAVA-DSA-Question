package for_Loop;

import java.util.Scanner;

public class All_Prime_Num {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 2 ; i<=n; i++) 
		{
			int c =0;
			for (int num=2;num<i;num++) 
			{   
			  if (i%num==0) {
				  c=c+1;
				  break;
			  }
			}
			if (c==0)
				System.out.println(i);

}
}
}