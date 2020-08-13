
public class mar29_1 {
   public static void main(String[]args) {
	   Predicate p1= new Predicat();
	   p1.consuma(1);
	   
	   Predicate p2= new Predicate(){
		   public void consuma(int a) {
			   System.out.println(a);
		   }
	   };
	   p2.consuma(2);
	   
       Predicate p3= x-> System.out.println(x);
       p3.consuma(3);
   }   
   private static class Predicat implements Predicate{
	   public void consuma(int a) {
		   System.out.println(a);
	   }
   }
   
}
