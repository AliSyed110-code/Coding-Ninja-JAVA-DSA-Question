package Array;

public class Linear_Search {

	public static int LinearSearch1(String menu[], String key) {

		for (int i = 0; i < menu.length; i++) {
			if (menu[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static int LinearSearch(int numbers[], int key) {

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {

//		int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
//		int key = 10;

		String menu[] = { "dosa", "chole", "samosa", "sandwich" };
		String select = "samosa";

		System.out.println(LinearSearch1(menu, select));

//		System.out.println(LinearSearch(numbers, key));

	}

}
