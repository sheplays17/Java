
public class jul30  {
		
	  private static class Predicat implements Predikkt{
		  public void compara(int a, int b) {
			  System.out.println(a>b);
		  }		  
	  }
	 
	  public static void main(String[]args) {
		  Predikkt p= new Predicat();
		  p.compara(1,2);
		  
		  Predikkt p2= new Predicat() {
			  public void compara(int a,int b) {
				  System.out.println(a==b);
			  }

		  };
		  p2.compara(1,1);
          Predikkt p3 = (a,b)-> System.out.println(a>b);
          p3.compara(1, 3);
		  
	  }
}
