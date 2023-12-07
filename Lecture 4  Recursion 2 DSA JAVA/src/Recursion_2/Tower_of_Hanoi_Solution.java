package Recursion_2;

public class Tower_of_Hanoi_Solution {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if (disks == 1) {
			System.out.println(source + " " + destination);
			return;
		}
		if (disks == 0) {
			return;
		}
		towerOfHanoi(disks - 1, source, destination, auxiliary);
		System.out.println(source + " " + destination);
		towerOfHanoi(disks - 1, auxiliary, source, destination);
	}

	public static void main(String[] args) {

		towerOfHanoi(2, 'a', 'b', 'c');

	}

}
