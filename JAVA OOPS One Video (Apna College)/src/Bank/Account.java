package Bank;

public class Account {

	public String name;
	protected String email;
	private String Password;

	public String getPassword() {
		setpassword(Password);
		return this.Password;
	}

	public void setpassword(String pass) {

		this.Password = pass;

	}
}
