package javacourse1;
import java.util.Scanner;

public class questiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		int n = s.nextInt();
		int count = 0;
		for(int i =2000; i<=n; i++){
			if(i%4==0) {
				count++;
				 
					//System.out.println(i);
				}
			}
		System.out.println(count);
		}
		

	}


