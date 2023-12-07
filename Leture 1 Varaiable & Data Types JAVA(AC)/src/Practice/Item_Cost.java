package Practice;

import java.util.Scanner;

public class Item_Cost {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float pencil = s.nextFloat();
		float pen = s.nextFloat();
		float eraser = s.nextFloat();

		float total = pencil + pen + eraser;

		System.out.println("Bill is : " + total);

		float newtotal = total + (0.18f * total);

		System.out.println("Bill with GST " + newtotal);

	}

}
