import java.util.Scanner;
public class Average {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the student name");
		String str = s.nextLine();
		System.out.println(str);
		System.out.println("Enter the Marks");
		int M1= s.nextInt();
		int M2= s.nextInt();
		int M3= s.nextInt();
		int AVG = (M1+M2+M3)/3;
		System.out.println(AVG);

	}

}
