package Bank;

public class Bank {

	public static void main(String[] args) {

		Account a1 = new Account();

		a1.name = "Customer";
		a1.email = "sahilabbas385@gmail.com";
		a1.setpassword("abc");
		System.out.println(a1.getPassword());

	}

}
