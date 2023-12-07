package Priority_Queues_II;

public class checkMaxHeap {

	public static boolean checkMaxHeap(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < arr.length; i++) {
			if ((2 * i + 1) < n && arr[i] < arr[(2 * i + 1)])
				return false;
			if ((2 * i + 2) < n && arr[i] < arr[(2 * i + 1)])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {

	}

}
