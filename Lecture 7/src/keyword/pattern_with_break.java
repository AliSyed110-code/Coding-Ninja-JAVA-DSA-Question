package keyword;

public class pattern_with_break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n = 4;
       int i = 1;
       while (i<=n) {
    	   int j = 1;
    	   while (j<=n) {
    		   System.out.print(j + " ");
    		   j++;
    		   if (j>i) {
    			   break;
    		   }
    	   }
    	   System.out.println();
    	   i++;
       }
	}

}
