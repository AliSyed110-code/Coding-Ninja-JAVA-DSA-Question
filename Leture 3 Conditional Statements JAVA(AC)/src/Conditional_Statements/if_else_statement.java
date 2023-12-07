package Conditional_Statements;

public class if_else_statement {

	public static void main(String[] args) {

		int age = 22;
		if (age >= 18) {
			System.out.println("adult : drive, Vote");
		}

		else if (age > 13 && age < 18) {
			System.out.println("teenagers");
		}

		else {
			System.out.println("not adult");
		}

	}

}
