package Recursion_1;


public class Geometric_Sum {

	public static double findGeometricSum(int k) {
		if (k == 0) {
			return 1;
		}
		double smallCase = findGeometricSum(k - 1);
		double ans = (Math.pow(0.5,k)+ smallCase);
		return ans;
	}

	public static void main(String[] args) {

		int k = 3;
		System.out.println(findGeometricSum(k));
		
	}

}
