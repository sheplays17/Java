
public class jul311 {
	
	  private static class Predica implements Predikiki{
		  @Override
		  public void consuma(int a) {
			 System.out.println("p1 "+a); 
		  }
	  }
	  private  class Predica2 implements Predikiki{
		  @Override
		  public void consuma(int a) {
			 System.out.println(a); 
		  }
	  }
	  public static void main(String[]args) {
		  
		   Predikiki p1 = new Predica();
		   p1.consuma(1);
		   
		   jul311 j= new jul311();
		   Predica2 p= j.new Predica2();
		   
		   Predikiki p3 = new Predica(){
			      @Override
				  public void consuma(int a) {
					 System.out.println("p2 "+a); 
				  }
		   };
		   p3.consuma(14);
		   
		   Predikiki p4 = x->  System.out.println("p4 "+x);
		   p4.consuma(12);
	  }
}
