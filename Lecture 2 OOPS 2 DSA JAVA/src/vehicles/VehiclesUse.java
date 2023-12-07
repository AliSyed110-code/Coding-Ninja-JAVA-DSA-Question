package vehicles;

import java.util.Scanner;

public class VehiclesUse {

	public static void main(String[] args) {
		// Vehicles v1 = new Vehicles(20);
		Vehicles v = new car(1,2);
//      v1.colour = "Black";
//      v1.setMaxspeed(10);
		// v1.print();

		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		
		if (n == 0) {
			v = new car(10, 20);
		} else {
			// v = new Vehicles(20);
		}
		// v.isCovertible;
		// v.print();

		// boolean ans = v.isconvertible;

		// car c1 = new car(10, 0);
		// c1.numGears = 10;
//      c1.colour = "Black";
//      c1.setMaxspeed(100);
		// c1.print();
		// c1.print();
	}

}
