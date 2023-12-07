package Pattern_Advance;

public class Hollow_Rectangle {

	public static void HallowRec(int tolRow, int tolCol) {
		// boundry
		for (int i = 1; i <= tolRow; i++) {
			for (int j = 1; j <= tolCol; j++) {
				if (i == 1 || i == tolRow || j == 1 || j == tolCol) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		HallowRec(4, 5);
	}

}
