package lab02task1;

public class Complex {
	private int real,imaginary;
	
	public Complex(int real,int imaginary) {
		this.real=real;
		this.imaginary=imaginary;
	}
	public Complex() {
		this(0,0);
	}
	public Complex(Complex c) {
		this.real=c.real;
		this.imaginary=c.imaginary;
	}
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImaginary() {
		return imaginary;
	}
	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	
	public void addWithComplex(Complex c) {
		this.real=this.real+c.real;
		this.imaginary= this.imaginary+c.imaginary;			
	}
	public void showNumber() {
		System.out.println(this.real+"."+this.imaginary);
	}
}
