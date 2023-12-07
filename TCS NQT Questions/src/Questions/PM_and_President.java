package Questions;

import java.math.BigInteger;
import java.util.*;

public class PM_and_President {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		BigInteger res = BigInteger.ONE;

		for (int i = 1; i <= n - 1; i++) {
			res = res.multiply(BigInteger.valueOf(i));
		}
		res = res.multiply(BigInteger.valueOf(2));
		System.out.println(res);
	}

}
