
public class mar29_4 {
  public static void main(String[]args) {
	 Predicate p1= new Predicat();
	 p1.consuma(10);
	 
	 Predicate p2= new Predicat2();
	 p2.consuma(10);
	 
	 Predicate p3= new Predicate() {
		 @Override
		 public void consuma(int x) {
			  System.out.println(x+30);
		 }
	 };
	 p3.consuma(10);
  }
  
  private static class Predicat implements Predicate{
	  @Override
	  public void consuma(int x) {
		  System.out.println(x+10);
	  }
  }
  
  private static class Predicat2 implements Predicate{
	  @Override
	  public void consuma(int x) {
		  System.out.println(x+20);
	  }
  }
}
