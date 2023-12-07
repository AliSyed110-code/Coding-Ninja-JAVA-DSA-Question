 package com.company;

public class Assignment4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	class user{
		String  name;
		String  Address ;
		int mobNO;
		
		 void capture(String name , String Address , int Mobno) {
			this.name  = name;
			this.Address = Address;
			this .mobNO = Mobno;
		}
		 void out() {
			 System.out.println("User name is ; "+ name);
			 System.out.println("User Address is : "+Address);
			 System.out.println("User Number is "+ mobNO);
		 }
	}

}
