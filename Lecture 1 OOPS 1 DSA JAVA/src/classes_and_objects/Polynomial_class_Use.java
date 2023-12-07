package classes_and_objects;

public class Polynomial_class_Use {

	public static void main(String[] args) {
		Polynomial_class p1 = new Polynomial_class();
		p1.setCoefficient(0, 3);
		p1.setCoefficent(2, 2);
		p1.print();

		Polynomial_class p2 = new Polynomail();
		p2.setCoefficient(0, 3);
		p2.setCoefficient(2, 2);
		p2.setCoefficient(1, 4);
		p2.setCoefficient(2, 5);
		p2.print();

		p1.add(p2);
		p1.print();
		p2.print();

		p2.multiply(p1);
		p2.print();
		p1.print();

		Polynomail p3 = polynomial.add(p1, p2);
		p3.print();
		p1.print();
		p2.print();
	}

}
