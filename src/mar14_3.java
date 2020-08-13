
public class mar14_3 {
   public static void main(String[]args) {
	   
	   Predicat p1= x -> x>10;
	   System.out.println(p1.consuma(11));
	   
	   Predicat p2= x-> x == 2;
	   System.out.println(p2.consuma(2));
	   System.out.println(p2.consuma(3));
	   
	   Predicat p3= x-> {return x%2==0;};
	   System.out.print(p3.consuma(11));


	   
   }
}
