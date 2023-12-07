package javacourse1;
import java.util.Scanner;

public class starpatternquestion6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
	int n= s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
				
			}
			for(int k=1; k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");		
			}
			for(int k=n-1;k>=i;k--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	}


