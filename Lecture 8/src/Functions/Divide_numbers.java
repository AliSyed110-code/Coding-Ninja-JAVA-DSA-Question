package Functions;

public class Divide_numbers {

	public static int dividenumbers(int num,int deno) {
		if (deno==0) {
			return Integer.MIN_VALUE;
			
		}
		System.out.println("Inside the divison");
		return num/deno;
	}
	public static void printDivisionResult(int num , int deno ) {
		if (deno==0) {
			System.out.println("Divisible by zero not allowed");
			return ;
		}
	}
	
	
	public static void main(String[] args) {
		
	int num = 8;
	int deno = 0;
	 printDivisionResult(num , deno);	
    int result = dividenumbers(num, deno);
    if (result >0) {
    	
    }else{
    	
    }
 //	System.out.println(result);
		

	}

}
