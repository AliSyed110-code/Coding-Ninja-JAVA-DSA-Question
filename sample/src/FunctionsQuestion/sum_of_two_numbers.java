package FunctionsQuestion;
import java.util.Scanner;
public class sum_of_two_numbers {

	public sum_of_two_numbers() {
		// TODO Auto-generated constructor stub
	}
    public static int findsum(int a , int b) {
    	int sum= a+b;
    	return sum;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c=findsum(a,b);
		System.out.println(c);

	}

}