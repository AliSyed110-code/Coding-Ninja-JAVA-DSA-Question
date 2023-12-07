package OOPS;

import Bank.*;

public class OOPS {

	public static void main(String[] args) {

		
		Pen pen1 = new Pen();

		pen1.colour = "Blue";
		pen1.type = "gel";

		pen1.write();

		Pen pen2 = new Pen();

		pen2.colour = "Black";
		pen2.type = "Ball Pen";

		pen1.PrintColour();
		pen2.PrintColour();
	}

}
