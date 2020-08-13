

 class Demo{
	
	private class Inner{
		public void mesajInner() {
			System.out.print("mesaj inner");
		}
	}
	
	public void getMesajInner() {
		Inner in = new Inner();
		in.mesajInner();
	}
 }

public class Outer1{
	
	public static void main(String[] args) {
		Demo o= new Demo();
		o.getMesajInner();
	}
}