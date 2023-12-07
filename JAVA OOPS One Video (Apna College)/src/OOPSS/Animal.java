package OOPSS;

abstract class Animal {

	abstract void walk();

	public Animal() {
		System.out.println("Created a new Animal");
	}

	public void eats() {
		System.out.println("Animal eats");
	}

}
