package lab02task1;

public class Main {
  public static void main(String[]args) {
	  Complex c1= new Complex();
	  Complex c2=new Complex(3,4);
	  Complex c3= new Complex(c2);
	  c1.showNumber();// 0.0
	  c2.showNumber();// 3.4
	  c3.showNumber();// 3.4
	  
	  c2.setReal(10);// 10.4
	  c2.setImaginary(1);// 10.1
	  c2.addWithComplex(c3);// 13.5
	  c2.showNumber();
  }
}
