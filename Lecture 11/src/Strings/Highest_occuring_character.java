package Strings;

import java.util.Scanner;

public class Highest_occuring_character {

	public static char highestOccuringChar(String str) {
		int arr[]=new int[256];
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)]++;
        }
        int max=0,idx=0;
        for(int i=0;i<256;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return(char)max;
    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char higestOccuring = highestOccuringChar(str);
		System.out.println(higestOccuring);
	}

}
