package VaraiableDataTypes;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

//      Type Casting
//		float a = 25.0f;
//		int b = (int) a;
//		System.out.println(b);
		
		float rad = s.nextFloat();
		float area = 3.14f * rad * rad;
		System.out.println(area);
	}
}
