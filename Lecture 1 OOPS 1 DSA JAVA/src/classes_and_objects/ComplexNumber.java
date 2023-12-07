package classes_and_objects;

public class ComplexNumber {

	private int Real;
	private int Imaginary;
	
 public ComplexNumber(int Real, int Imaginary ) {
	 this.Real = Real;
	 this.Imaginary = Imaginary;
 }
 
 
 public int getReal() {
	 return Real;
 }
 public int getImaginary() {
	 return Imaginary;
 }
 public void setReal(int n) {
	 this.Real = n;
 }
 public void setImaginary(int n) {
	 this.Imaginary  = n;
 }
 public void print() {
	 System.out.println(this.Real+" + i"+this.Imaginary);
 }
 public void add(ComplexNumber c2) {
	 this.Real = this.Real + c2.Real;
	 this.Imaginary = this.Imaginary + c2.Imaginary;
 }
 public void multiply(ComplexNumber c2) {
	 this.Real = this.Real * c2.Real;
	 this.Imaginary = this.Imaginary * c2.Imaginary;
 }
  
 public void Conjugate() {
	 
 }
 
 public static ComplexNumber add (ComplexNumber c1 , ComplexNumber c3) {
	 int newReal = c1.Real + c3.Real;
	 int newImagin = c1.Imaginary + c3.Imaginary;
	 ComplexNumber c = new ComplexNumber(newReal, newImagin);
	 return c;
 }
}
