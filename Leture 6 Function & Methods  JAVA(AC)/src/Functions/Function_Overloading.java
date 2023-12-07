package Functions;

public class Function_Overloading {

//	//Function call sum of 2 number.
//	public static int sum(int a, int b) {
//		return a + b;
//	}
//
//	//Function call sum of 3 number.
//	public static int sum(int a, int b, int c) {
//		return a + b + c;
//	}

	// Function to call int sum.
	public static int sum(int a, int b) {
		return a + b;
	}

	// Function to call int sum.
	public static float sum(float a, float b) {
		return a + b;
	}

	public static void main(String[] args) {

		System.out.println(sum(5, 3));
		System.out.println(sum(2.0f, 3.5f));
	}

}
