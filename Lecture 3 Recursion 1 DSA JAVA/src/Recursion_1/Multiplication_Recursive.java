package Recursion_1;

public class Multiplication_Recursive {
		 
  public static int multiplyTwoIntegers(int m, int n){
	  if(n==0) {
		  return 0;
	  }
	  int smallAns = m*(n-1);
	  return smallAns + m;
  }
	
	public static void main(String[] args) {
		int m = 4;
		int n = 6;
		System.out.println(multiplyTwoIntegers(m, n));
	}

}
