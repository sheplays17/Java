public class Outeer {
	  static class Inner{
		  public void mesaj() {
			  System.out.println("mesaj inner static");
		  }
	  }
	  class Inner2{
		  public void mesaj() {
			  System.out.println("mesaj inner nestatic");
		  }
	  }
	  public static void main(String[]args){
		  
		  Outeer.Inner in = new Outeer.Inner();
		  in.mesaj();
		  
		  Outeer out= new Outeer();
		  Outeer.Inner2 in2 = out.new Inner2();
		  in2.mesaj();
	  }
}
