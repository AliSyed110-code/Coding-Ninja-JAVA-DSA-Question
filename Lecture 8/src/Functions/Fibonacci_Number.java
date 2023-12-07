package Functions;

public class Fibonacci_Number {
	
	public static boolean checkMember(int n){
		if (n==0) 
		{
			return false;
		}
		else 
		{
			int val1= (5*n*n)-4;
			int sq1 = (int)Math.sqrt(val1);
			if (sq1*sq1==val1)
			{
				return true;
			}
		    else 
		    {
			int val2=(5*n*n)+4;
		    int Sq2 =(int)Math.sqrt(val2);
		    return (Sq2*Sq2==val2);
		  }
		}
	}

}
