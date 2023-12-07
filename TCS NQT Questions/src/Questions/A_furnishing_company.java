package Questions;

import java.util.*;

public class A_furnishing_company {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		String str = s.next();
		int l = s.nextInt();
		int maxa = 0;
		int counta = 0;
		for (int i = 0; i < str.length(); i++) {
			if (i % l == 0) {
				if (maxa < counta) 
					maxa = counta;
				
				counta = 0;
			}
			if (str.charAt(i) == 'a') 
				counta++;
		}
			if (maxa < counta) 
				maxa = counta;
			System.out.println(maxa);
	}

}
