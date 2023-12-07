package javacourse1;
import java.util.Scanner;

public class starpatternquestion4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S= new Scanner(System.in);
		int n= S.nextInt();
		for(int i=n;i<=n;i++){
		for(int j=3; j>=i;j--){
		
		System.out.print(" ");
		}
        for(int k =n ; k<=i;k++) {
    	 System.out.print("*");
     }
     System.out.println();
}
}
}