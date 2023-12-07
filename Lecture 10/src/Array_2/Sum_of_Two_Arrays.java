package Array_2;

public class Sum_of_Two_Arrays {

	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int k = output.length - 1;
		int s = 0;
		int carry = 0;
		while (i >= 0 && j >= 0) {
			s = arr1[i] + arr2[j] + carry;
			output[k] = (s % 10);
			carry = (s / 10);
			k--;
			i--;
			j--;
		}
		while (i >= 0) {
			s = arr1[i] + carry;
			output[k] = (s % 10);
			carry = (s / 10);
			i--;
			k--;
		}
		while (j >= 0) {
			s = arr2[j] + carry;
			output[k] = (s % 10);
			carry = (s / 10);
			j--;
			k--;
		}
		if (carry != 0) {
			output[k] = carry;
			k--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = { 9, 9, 9, 1, 3, 4 };
		int arr2[] = { 2, 0, 6, 6 };
		sumOfTwoArrays(arr1, arr2, arr2);
	}

}
