package classes_and_objects;

public class ComplexNumberClass {

	private int real;
	private int imaginary;

	public ComplexNumberClass(int real, int imaginary) {
		this.real = real;
		this.imaginary = imaginary;
	}

	public void plus(ComplexNumberClass c) {
		this.real = real + c.real;
		this.imaginary = imaginary + c.imaginary;
	}

	public void multiply(ComplexNumberClass c) {
		int newReal = ((this.real) * (c.real) - (this.imaginary * c.imaginary));
		int newImaginary = (this.real * c.imaginary) + (this.imaginary * c.real);
		this.real = newReal;
		this.imaginary = newImaginary;
	}

	public void print() {
		System.out.println(this.real+" + i"+this.imaginary);
	}
}